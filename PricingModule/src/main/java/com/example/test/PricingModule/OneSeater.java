package com.example.test.PricingModule;

public class OneSeater implements Seating {

	@Override
	public int calculatePrice() {
		
		return PriceSheet.oneSeaterPrice;
	}

}
