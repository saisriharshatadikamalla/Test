package com.example.test.PricingModule;

public class TwoSeating implements Seating{

	@Override
	public int calculatePrice() {
		
		return PriceSheet.getTwoSeaterPrice();
	}

}
