package main.java.manager;

import java.util.HashMap;
import java.util.Map;

import main.java.domain.Item;
import main.java.domain.ItemList;
import main.java.error.ExistingListException;
import main.java.error.NoMatchingItemException;
import main.java.error.NoMatchingListException;

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
	
	public static Item getItem(String listId, String itemId) throws NoMatchingItemException, NoMatchingListException {
		return getList(listId).getItem(itemId);
	}
	
	public static void addItemToList(Item item, String listId) throws NoMatchingListException {
		getList(listId).addItem(item);
	}
	
}
