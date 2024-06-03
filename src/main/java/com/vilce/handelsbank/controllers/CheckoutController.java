package com.vilce.handelsbank.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vilce.handelsbank.models.ResponseCheckout;
import com.vilce.handelsbank.utilities.Utilities;


@RestController
public class CheckoutController {
	
	
	
	@PostMapping("/checkout")
	public ResponseEntity<ResponseCheckout> checkout(@RequestBody List<String> list) {
		
		HashMap<String, Integer> listCheckout = Utilities.getListWatchesAndQuantity(list);		
		
		HashMap<String, Integer> listCheckoutPrices = Utilities.getTheListOfPricesOnWatchType(listCheckout);
		
		Integer totalPrice = 0;
		for(int i = 0; i < listCheckoutPrices.size(); i++) {
			totalPrice = totalPrice + listCheckoutPrices.get(listCheckoutPrices.keySet().toArray()[i].toString());
		}
		
		ResponseCheckout responseCheckout = new ResponseCheckout(totalPrice);
		
		
		return ResponseEntity.ok(responseCheckout);
	}
	

}
