package com.terra.app.sd.strategy;

public abstract class Furniture {
	protected IMaterial material;
	protected String furnitureName;

	public Furniture(IMaterial material, String name) {
		this.material = material;
		this.furnitureName = name;
	}

	public abstract void getDetails();


}
