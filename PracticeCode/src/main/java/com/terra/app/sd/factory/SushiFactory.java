package com.terra.app.sd.factory;

public class SushiFactory implements DishFactory {

	@Override
	public Dish createDish() {
		return new Sushi();
	}

}
