package com.example.test.PricingModule;

public class IronFrame implements Frame {
	
	@Override
	public int getPrice(String season) {

		if (season.equals("summer")) {
			return PriceSheet.getIronFramePrice();
		}

		return 400;
	}

}
