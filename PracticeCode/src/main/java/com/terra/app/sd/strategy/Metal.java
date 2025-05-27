package com.terra.app.sd.strategy;

public class Metal implements IMaterial {

	@Override
	public String getMaterial() {
		return "metal";
	}

	@Override
	public double getWeight() {
		return 5.0;
	}

}
