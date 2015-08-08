package main.java.faces;

import java.util.List;

import javax.faces.bean.ManagedBean;

import main.java.domain.ItemList;
import main.java.manager.Manager;

@ManagedBean
public class FacesManagedBean {

	public List<ItemList> getLists() {
		return Manager.getAllLists();
	}

	public boolean isListEmpty() {
		return Manager.getAllLists() != null;
	}

}
