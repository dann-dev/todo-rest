package main.java.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/test")
public class FirstRest {
	
	public FirstRest() {
	}
	
	@GET
	@Produces("text/plain")
	public String test() {
	    return "Test";
	}

}
