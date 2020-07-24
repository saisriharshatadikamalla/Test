package com.example.test.PricingModule;

public class AlloyWheels implements Wheels {

	@Override
	public int calculateprice() {
		
		return PriceSheet.getAlloyWheelsPrice();
	}

}
