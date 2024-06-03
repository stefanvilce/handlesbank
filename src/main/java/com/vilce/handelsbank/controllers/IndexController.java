package com.vilce.handelsbank.controllers;


import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vilce.handelsbank.data.Catalog;
import com.vilce.handelsbank.models.Index;


@RestController
public class IndexController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/")
	public Index index(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Index(counter.incrementAndGet(), String.format(template, name));
	}
	
	
	
	@GetMapping("/all")
	public ResponseEntity<JsonNode> all() throws JsonMappingException, JsonProcessingException {
		Catalog catalog = new Catalog();
		
		
		String listString = catalog.getList().stream().map(Object::toString)
                .collect(Collectors.joining(", "));
		System.out.println(listString);
		
		
		ObjectMapper mapper = new ObjectMapper();
        JsonNode json = mapper.readTree(listString);
        return ResponseEntity.ok(json);
	}
	
}
