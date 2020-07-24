package com.example.test.PricingModule;

public class FrameComponents {

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getSpikes() {
		return spikes;
	}
	public void setSpikes(String spikes) {
		this.spikes = spikes;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	private String material;
	private String spikes;
	public FrameComponents(String material, String spikes, String color) {
		super();
		this.material = material;
		this.spikes = spikes;
		this.color = color;
	}
	private String color;
	
}
