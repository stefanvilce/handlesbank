package com.vilce.handelsbank.controllers;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vilce.handelsbank.data.Watches;
import com.vilce.handelsbank.models.Watch;



@RestController
public class IndexController {
	
	@GetMapping("/")
	public ResponseEntity<List<Watch>> all() {
		Watches watches = new Watches();		
		return ResponseEntity.ok(watches.getList());
	}
	
}
