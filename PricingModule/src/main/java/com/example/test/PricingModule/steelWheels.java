package com.example.test.PricingModule;

public class steelWheels implements Wheels{

	@Override
	public int calculateprice() {
		return PriceSheet.getSteelWheelsPrice();
	}

}
