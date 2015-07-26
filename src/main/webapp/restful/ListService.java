package main.webapp.restful;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import main.webapp.domain.ItemList;
import main.webapp.error.ExistingListException;
import main.webapp.error.NoMatchingListException;
import main.webapp.manager.Manager;

@Path("/list")
public class ListService {

	@GET
	@Path("/{listId}")
	public ItemList listServiceGet(@PathParam("listId") String listId) throws NoMatchingListException {
		return Manager.getList(listId);
	}
	
	@POST
	public String listServicePost(@FormParam("id") String id, @FormParam("name") String name) throws ExistingListException {
		if( null != id && null != name) {
			ItemList list1 = new ItemList(id,name);
			Manager.addList(list1.getId(), list1);
			return "List Added";
		}
		return "post request recieved on list service";
	}
	
	@PUT
	public String listServicePut() {
		return "not currently implemented";
	}
	
	@DELETE
	public String listServiceDelete() {
		return "delete request received on list services";
	}
}
