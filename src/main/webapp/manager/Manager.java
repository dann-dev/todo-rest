package main.webapp.manager;

import java.util.HashMap;
import java.util.Map;

import main.webapp.domain.ItemList;
import main.webapp.error.ExistingListException;
import main.webapp.error.NoMatchingListException;

public class Manager {

	private static Map<String, ItemList> itemLists = new HashMap<String, ItemList>();
	
	public static void addList(String key, ItemList list) throws ExistingListException {
		if (itemLists.containsKey(key)) {
			throw new ExistingListException("List already exists");
		} else {
			itemLists.put(key, list);
		}
	}
	
	public static ItemList getList(String key) throws NoMatchingListException {
		if (itemLists.containsKey(key)) {
			return itemLists.get(key);
		} else {
			throw new NoMatchingListException("No list matching key");
		}
	}
	
	public static void updateList(String key, ItemList list) throws NoMatchingListException {
		if (itemLists.containsKey(key)) {
			itemLists.put(key, list);
		} else {
			throw new NoMatchingListException("No list matching key");
		}
	}
	
	public static void deleteList(String key) throws NoMatchingListException {
		if (itemLists.containsKey(key)) {
			itemLists.remove(key);
		} else {
			throw new NoMatchingListException("No list matching key");
		}
	}
	
}
