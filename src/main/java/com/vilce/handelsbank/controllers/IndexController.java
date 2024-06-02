package com.vilce.handelsbank.controllers;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vilce.handelsbank.models.Index;


@RestController
public class IndexController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/")
	public Index index(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Index(counter.incrementAndGet(), String.format(template, name));
	}	
	
}
