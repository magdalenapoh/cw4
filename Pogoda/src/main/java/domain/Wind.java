package domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wind {
	
	private String speed;

    public String getSpeed ()
    {
        return speed;
    }

    public void setSpeed (String speed)
    {
        this.speed = speed;
    }

}
