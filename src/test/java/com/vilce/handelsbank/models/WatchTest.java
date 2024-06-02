package com.vilce.handelsbank.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WatchTest {
	
	Watch watch = new Watch("001", "First w",30,"");

	@Test
	void testWatch() {
		assertEquals("001", watch.getId());
		assertEquals("First w", watch.getName());
		assertEquals(30, watch.getPrice());
		assertEquals("", watch.getDiscount());
	}
	
	
	@Test
	void testModifiedWatch() {
		watch.setName("The new name");
		watch.setPrice(35);
		assertEquals("The new name", watch.getName());
		assertEquals(35, watch.getPrice());		
	}
	
	/*
	@Test
	void testIDandPriceType() {
		
		assertTrue(watch.getName());
		assertEquals(35, watch.getPrice());		
	}*/

}
