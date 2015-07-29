package main.webapp.restful;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import main.webapp.domain.Item;
import main.webapp.error.NoMatchingItemException;
import main.webapp.error.NoMatchingListException;
import main.webapp.manager.Manager;

@Path("item")
public class ItemService {

	@GET
	@PathParam("/{listId}/{itemId}")
	public Item getItem(@PathParam("listId") String listId, @PathParam("itemId") String itemId) throws NoMatchingItemException, NoMatchingListException {
		return Manager.getItem(listId, itemId);
	}
	@POST
	@PathParam("/additem")
	public void postItem(@FormParam("id") String id, @FormParam("name") String name, @FormParam("desc") String desc, @FormParam("listId") String listId) throws NoMatchingListException {
		Item item = new Item(id,name,desc);
		Manager.addItemToList(item, listId);
	}
}
