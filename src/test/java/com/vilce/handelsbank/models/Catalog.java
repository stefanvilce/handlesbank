package com.vilce.handelsbank.models;

import java.util.List;

public class Catalog {
	private List<Watch> list;

	public Catalog(List<Watch> list) {
		super();
		this.list = list;
	}
	
	public Catalog() {
		Watch watch = new Watch("001", "W1", 30, "3 for 200");
		this.list.add(watch);
		this.list.add(new Watch("002", "W2", 50, "2 for 100"));
		this.list.add(new Watch("003", "W3", 70, ""));
	}
	
	
	//add getters and setters
	
	

}
