package com.vilce.handelsbank.utilities;

import java.util.HashMap;
import java.util.List;

import com.vilce.handelsbank.data.Watches;
import com.vilce.handelsbank.models.Discount;
import com.vilce.handelsbank.models.ResponseCheckout;
import com.vilce.handelsbank.models.Watch;



public class Utilities {
	
	
	public static Integer calculateThePrice(Watch watch, Integer noPieces) {
		Integer price = noPieces * watch.getPrice();
		if(watch.getDiscount() != null) {
			Discount discount = watch.getDiscount();
			if(discount != null) {
				price = (noPieces / discount.getNoPieces()) * discount.getPriceTotal() + (noPieces % discount.getNoPieces()) * watch.getPrice();
			}
		}
		return price;
	}
	
	
	
	public static HashMap<String, Integer> getListWatchesAndQuantity(List<String> list){
		HashMap<String, Integer> listCheckout = new HashMap<>();
		for(int i=0; i<list.size(); i++){
			listCheckout.put(list.get(i), listCheckout.containsKey(list.get(i)) ? listCheckout.get(list.get(i)) + 1 : 1);
		}
		return listCheckout;
	}
	

	
	public static HashMap<String, Integer> getTheListOfPricesOnWatchType(HashMap<String, Integer> listCheckout){
		Watches watches=new Watches();
		HashMap<String, Integer> listCheckoutPrices = new HashMap<>();
		for(int i=0; i < listCheckout.size(); i++) {
			Watch watch = watches.findWatch(listCheckout.keySet().toArray()[i].toString());
			if(watch != null) {
				int noPieces = listCheckout.get(listCheckout.keySet().toArray()[i].toString());
				listCheckoutPrices.put(listCheckout.keySet().toArray()[i].toString(), Utilities.calculateThePrice(watch, noPieces));
			} else {
				System.out.println("ERROR! There is an error in Request. \nOne of the watches does not exist.");
			}
		}
		return listCheckoutPrices;
	}
	
	
	
	public static ResponseCheckout totalPrice(List<String> list) {
		HashMap<String, Integer> listCheckout = getListWatchesAndQuantity(list);
		HashMap<String, Integer> listCheckoutPrices = getTheListOfPricesOnWatchType(listCheckout);
		Integer totalPrice = 0;
		for(int i = 0; i < listCheckoutPrices.size(); i++) {
			totalPrice = totalPrice + listCheckoutPrices.get(listCheckoutPrices.keySet().toArray()[i].toString());
		}		
		ResponseCheckout responseCheckout = new ResponseCheckout(totalPrice);
		
		return responseCheckout;
	}
}
