package com.example.promotion;

public class CheckoutCart {
	
	public int checkout(Item item, CartItems ci, Promotions promo) {
		var wrapper = new Object(){ int total = 0; };
		try {
			ci.items.forEach((k,v) -> {
				String id = k;
				int value = v;
				System.out.println(id+"  "+value);
				int tempTotal = 0;
				for(int i=0;i<promo.promos.size();i++) {
					int present = i;
					if(promo.promos.get(present).size()>1) {
						
					}
					else {
						System.out.println("Products with no multiple offers");
					}
				}
			});
			
		}
		catch(Exception e) {
			System.out.print(e.toString());
		}
		return wrapper.total;
	}

}
