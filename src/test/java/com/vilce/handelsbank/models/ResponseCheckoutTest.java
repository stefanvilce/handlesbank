package com.vilce.handelsbank.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResponseCheckoutTest {

	@Test
	void test() {
		ResponseCheckout resp = new ResponseCheckout(200);
		assertEquals(200, resp.getPrice());
		resp.setPrice(300);
		assertEquals(300, resp.getPrice());
	}

}
