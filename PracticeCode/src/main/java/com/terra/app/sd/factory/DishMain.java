package com.terra.app.sd.factory;

public class DishMain {

	public static void main(String[] args) {

		// Order a pizza using the PizzaFactory

		DishFactory pizzaFactory = new PizzaFactory();
		Dish pizza = pizzaFactory.createDish();
		pizza.prepare();
		pizza.serve();

		DishFactory sushiFactory = new SushiFactory();
		Dish sushi = sushiFactory.createDish();
		sushi.prepare();
		sushi.serve();

	}

}
