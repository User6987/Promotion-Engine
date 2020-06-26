package com.example.promotion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PromotionEngineTestScenarioC {

	@Test
	void testExecuteCheckoutB() {
		try {
			System.out.println("::Enter Input according to Scenario C::");
			PromotionEngine pe = new PromotionEngine();
			int total = pe.executeCheckout();
			assertEquals(total,280);
		}
		catch(Exception e) {
			System.out.print("Something went wrong!!");
		}
	}

}
