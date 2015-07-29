package main.webapp.domain;

public class Item {

	private String id;
	private String name;
	private String desc;
	
	public Item() {
	}
	
	public Item(String id, String name, String desc) {
		this.id = id;
		this.name = name;
		this.desc = desc;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj==null) {
			return false;
		} else if (this.id == null) {
			return false;
		} else if (obj instanceof Item) {
			Item i = (Item) obj;
			
			if (this.id.equals(i.getId())) {
				return true;
			}
		}
		return false;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
