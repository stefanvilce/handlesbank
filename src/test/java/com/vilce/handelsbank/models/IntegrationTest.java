package com.vilce.handelsbank.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.vilce.handelsbank.data.Watches;

class IntegrationTest {

	@Test
	void testWatchesListtowardsDiscounts() {
		Watches watches = new Watches();
		
		
		for(int i=0; i < watches.getList().size(); i++) {
			Watch watch = watches.getList().get(i);
			if(watch.getDiscount() != null) {			
				assertTrue(watch.getDiscount().getName().length() > 0);
			}
		}
		
	}

}
