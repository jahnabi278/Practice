package com.terra.app.sd.strategy;

public class Wood implements IMaterial {

	@Override
	public String getMaterial() {
		return "wood";
	}

	@Override
	public double getWeight() {
		return 10.0;
	}

}
