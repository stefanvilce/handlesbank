package com.vilce.handelsbank.controllers;

import java.util.List;

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
		
		ResponseCheckout responseCheckout = Utilities.totalPrice(list);
		return ResponseEntity.ok(responseCheckout);
		
	}
	

}
