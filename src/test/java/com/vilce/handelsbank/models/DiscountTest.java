package com.vilce.handelsbank.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiscountTest {

	Discount discount = new Discount("3 for 100", 3, 100);

	@Test
	void testDiscount() {
		assertEquals("3 for 100", discount.getName());
		assertEquals(3, discount.getNoPieces());
		assertEquals(100, discount.getPriceTotal());
		discount.setNoPieces(4);
		assertTrue(4 == discount.getNoPieces());
	}
}
