package main.webapp.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import main.webapp.domain.Item;

@Path("item")
public class ItemService {

	@GET
	public Item getItem() {
		return new Item();
	}
}
