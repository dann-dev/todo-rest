package main.webapp.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import main.webapp.domain.ItemList;

@Path("/list")
public class ListService {

	@GET
	public ItemList getList() {
		return new ItemList();
	}
}
