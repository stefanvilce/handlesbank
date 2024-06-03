package com.vilce.handelsbank.controllers;


import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vilce.handelsbank.data.Discounts;
import com.vilce.handelsbank.data.Watches;
import com.vilce.handelsbank.models.Discount;
import com.vilce.handelsbank.models.Index;
import com.vilce.handelsbank.models.Watch;



@RestController
public class IndexController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/")
	public Index index(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Index(counter.incrementAndGet(), String.format(template, name));
	}
		
	
	
	// these two should disappear
	
	@GetMapping("/all")
	public ResponseEntity<List<Watch>> all() {
		Watches watches = new Watches();		
		return ResponseEntity.ok(watches.getList());
	}
	
	
	@GetMapping("/discounts/all")
	public ResponseEntity<List<Discount>> allDiscounts() {
		Discounts discount = new Discounts();		
		return ResponseEntity.ok(discount.getList());
	}
	
	
	
}
