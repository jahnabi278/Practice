package com.terra.app.sd.strategy;

public class Chair extends Furniture {

	public Chair(IMaterial material) {
		super(material, "Chair");
	}

	@Override
	public void getDetails() {
		System.out.println("This is a " + furnitureName + " made of " + material.getMaterial() + " and weight is "
				+ material.getWeight());
	}

}
