package com.example.promotion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PromotionEngineTestScenarioB {

	@Test
	void testExecuteCheckoutB() {
		try {
			PromotionEngine pe = new PromotionEngine();
			int total = pe.executeCheckout();
			assertEquals(total,370);
		}
		catch(Exception e) {
			System.out.print("Something went wrong!!");
		}
	}

}
