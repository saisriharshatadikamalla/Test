package com.example.test.PricingModule;

import java.util.Date;

public class SteelFrame implements Frame {

	@Override
	public int getPrice(String season) {

		if (season.equals("summer")) {
			return PriceSheet.getSteelFramePrice();
		}

		return 400;
	}

}
