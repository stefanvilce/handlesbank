package com.vilce.handelsbank.data;

import java.util.ArrayList;
import java.util.List;

import com.vilce.handelsbank.models.Discount;

public class Discounts {
	
	private List<Discount> list = new ArrayList<>();

	public Discounts() {
		list.add(new Discount("3 for 200", 3, 200));
		list.add(new Discount("2 for 120", 2, 120));
	}

	public List<Discount> getList() {
		return list;
	}
	
	public Discount findDiscount(String nameDiscount) {
	    for(Discount discount : list) {
	        if(discount.getName().equals(nameDiscount)) {
	            return discount;
	        }
	    }
	    return null;
	}	

}
