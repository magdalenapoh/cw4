package services;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import domain.Pogoda;

public class PogodaApiService {
	
	private String nazwaMiasta;
	private String url = "http://api.openweathermap.org/data/2.5/weather?appid=6e67ea783a23fa7d65666f9a6010f4a6&units=metric&q=Warszawa,pl";
		
	public Pogoda getAll() throws JsonParseException, JsonMappingException, IOException {
		
		ClientConfig clientConfig = new DefaultClientConfig();
		Client client = Client.create(clientConfig);
		
		WebResource webResource = client.resource(url);
		
		String response = webResource.get(String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		Pogoda res = mapper.readValue(response, Pogoda.class);
		
		return res;
		
	}

	public void setNazwaMiasta(String nazwaMiasta) {
		this.nazwaMiasta = nazwaMiasta;
		this.url = "http://api.openweathermap.org/data/2.5/weather?appid=6e67ea783a23fa7d65666f9a6010f4a6&units=metric&q="+nazwaMiasta+",pl";
	}

	public String getNazwaMiasta() {
		return nazwaMiasta;
	}
	
}