package com.vilce.handelsbank.data;

import java.util.ArrayList;
import java.util.List;

import com.vilce.handelsbank.models.Watch;

public class Catalog {
	private List<Watch> list = new ArrayList<>();

	public Catalog() {
		list.add(new Watch("001", "Rolex", 100, "3 for 200"));
		list.add(new Watch("002", "Michael Kors", 80, "2 for 120"));
		list.add(new Watch("003", "Swatch", 50, ""));
		list.add(new Watch("003", "Casio", 30, ""));
	}

	public List<Watch> getList() {
		return list;
	}

	@Override
	public String toString() {
		return "Catalog [list=" + list + "]";
	}
	
	

}
