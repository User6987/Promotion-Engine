package com.example.promotion;

import java.util.Scanner;

public class PromotionEngine {

	public static void main(String[] args) {
		try {
			int total = 0;
			Scanner in = new Scanner(System.in);
			System.out.print("Enter total number of items in cart:: ");
			int total_items = in.nextInt();
				
			if(total_items <=0) {
				System.out.print("You have entered invalid input.");
				System.exit(0);
			}
			else {
				
			}
			System.out.println("Total cost of the cart after applying promo:: "+ total);
			in.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
