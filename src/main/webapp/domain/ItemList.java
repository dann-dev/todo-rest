package main.webapp.domain;

import java.util.ArrayList;

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
	
	public Item getItem(int i) {
		return items.get(i);
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
