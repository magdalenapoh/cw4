package domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Clouds {
	
	private String all;

    public String getAll ()
    {
        return all;
    }

    public void setAll (String all)
    {
        this.all = all;
    }

}
