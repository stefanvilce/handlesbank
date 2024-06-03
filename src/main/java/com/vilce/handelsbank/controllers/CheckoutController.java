package com.vilce.handelsbank.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.vilce.handelsbank.models.ResponseCheckout;
import com.vilce.handelsbank.utilities.Utilities;


@RestController
public class CheckoutController {	
	
	
	@RequestMapping(value = "/checkout", method = RequestMethod.POST, 
			headers={ "Accept=application/json", "Content-Type=application/json" }, 
			produces = "application/json")
	public ResponseEntity<ResponseCheckout> checkout(@RequestBody List<String> list) {
		
		ResponseCheckout responseCheckout = Utilities.totalPrice(list);
		return ResponseEntity.ok(responseCheckout);
		
	}
	

}
