package main.java.faces;

import javax.inject.Named;

import main.java.manager.Manager;

@Named("testPostsFaces")
public class TestPostsFaces {

	public String test() {
		System.out.println("test called");
		return Manager.test();
	}
}
