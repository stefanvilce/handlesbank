package com.vilce.handelsbank.data;

import java.util.ArrayList;
import java.util.List;

import com.vilce.handelsbank.models.Discount;
import com.vilce.handelsbank.models.Watch;

public class Watches {
	private List<Watch> list = new ArrayList<>();

	public Watches() {
		list.add(new Watch("001", "Rolex", 100, new Discount("3 for 200", 3, 200)));
		list.add(new Watch("002", "Michael Kors", 80, new Discount("2 for 120", 2, 120)));
		list.add(new Watch("003", "Swatch", 50, null));
		list.add(new Watch("004", "Casio", 30, null));
	}

	public List<Watch> getList() {
		return list;
	}
	
	public Watch findWatch(String codeId) {
	    for(Watch watch : list) {
	        if(watch.getId().equals(codeId)) {
	            return watch;
	        }
	    }
	    return null;
	}
	
}
