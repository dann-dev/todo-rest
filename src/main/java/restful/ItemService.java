package main.java.restful;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import main.java.domain.Item;
import main.java.error.NoMatchingItemException;
import main.java.error.NoMatchingListException;
import main.java.manager.Manager;

@Path("/item")
public class ItemService {

	@GET
	@PathParam("/{listId}/{itemId}")
	public Item getItem(@PathParam("listId") String listId, @PathParam("itemId") String itemId)
			throws NoMatchingItemException, NoMatchingListException {
		return Manager.getItem(listId, itemId);
	}

	@POST
	public Response postItem(@FormParam("id") String id, @FormParam("name") String name, @FormParam("desc") String desc,
			@FormParam("listid") String listId) throws NoMatchingListException, URISyntaxException {
		Item item = new Item(id, name, desc);
		Manager.addItemToList(item, listId);

		return Response.temporaryRedirect(new URI("http://localhost:8080/restapp/test/testposts.xhtml")).build();
	}

	@PUT
	public String itemServicePut() {
		return "not currently implemented";
	}

	@DELETE
	public String itemServiceDelete() {
		return "delete request received on list services";
	}
}
