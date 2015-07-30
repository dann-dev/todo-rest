package main.java.domain;

import java.util.ArrayList;

import main.java.error.NoMatchingItemException;

public class ItemList {
	
	private String id;
	private String name;
	
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public ItemList() {
	}
	
	public ItemList(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	
	public void addItem(Item i) {
		items.add(i);
	}
	
	public Item getItem(String id) throws NoMatchingItemException {
		for(Item item: items) {
			if (item.getId().equals(id)) {
				return item;
			}
		}
		throw new NoMatchingItemException("No matching item in list with id: " + id);
	}
	
	public void removeItem(Item i) {
		items.remove(i);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
