package com.terra.app.sd.strategy;

public class TestStrategyPattern {

	public static void main(String[] args) {
		IMaterial materialWood = new Metal();
		IMaterial materialMetal = new Metal();
		
		Chair chair = new Chair(materialWood);
		chair.getDetails();
		
		Table table = new Table(materialMetal);
		table.getDetails();
	}

}
