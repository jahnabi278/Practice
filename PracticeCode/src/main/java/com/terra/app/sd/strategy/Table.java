package com.terra.app.sd.strategy;

public class Table extends Furniture {

	public Table(IMaterial material) {
		super(material, "Table");
	}

	@Override
	public void getDetails() {
		System.out.println("This is a " + furnitureName + " made of " + material.getMaterial() + " and weight is "
				+ material.getWeight());
	}

}
