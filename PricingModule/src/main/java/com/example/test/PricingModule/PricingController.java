package com.example.test.PricingModule;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculatePrice")
public class PricingController {

	@RequestMapping(value = "/getPrice", method = RequestMethod.POST)
	public ResponseEntity<Output> getPrice(@RequestBody CycleConfiguration config) {

		Frame frame;
		Seating seating;
		Wheels wheels;
		Output output = new Output();

		if (config.getFrame().equalsIgnoreCase("ironFrame")) {
			frame = new IronFrame();
		} else {
			frame = new SteelFrame();
		}

		if (config.getWheels().equalsIgnoreCase("alloywheels")) {
			wheels = new AlloyWheels();
		} else {
			wheels = new steelWheels();
		}

		if (config.getSeating().equalsIgnoreCase("oneseater")) {
			seating = new OneSeater();
		} else {
			seating = new TwoSeating();
		}

		output.setFramePrice(frame.getPrice(config.getSeason()));
		output.setSeatPrice(seating.calculatePrice());
		output.setWheelPrice(wheels.calculateprice());
		output.setPrice(frame.getPrice(config.getSeason())+seating.calculatePrice()+wheels.calculateprice());

		return new ResponseEntity<Output>(output, HttpStatus.OK);

	}

	
}
