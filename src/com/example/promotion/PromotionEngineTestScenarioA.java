package com.example.promotion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PromotionEngineTestScenarioA {

	@Test
	void testExecuteCheckoutA() {
		try {
			System.out.println("::Enter Input according to Scenario A::");
			PromotionEngine pe = new PromotionEngine();
			int total = pe.executeCheckout();
			assertEquals(total,100);
		}
		catch(Exception e) {
			System.out.print("Something went wrong!!");
		}
	}
}
