package main.webapp.domain;

import java.util.ArrayList;

public class ItemList {
	
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public ItemList() {
		// TODO Auto-generated constructor stub
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

}
