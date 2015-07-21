package main.webapp.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/rest")
public class FirstRest {
	
	
	public FirstRest() {
		// TODO Auto-generated constructor stub
	}
	
	@GET
	@Produces("text/plain")
	public String getClichedMessage() {
	    // Return some cliched textual content
	    return "Hello World";
	}

}
