package com.terra.app.sd.factory;

public class Sushi implements Dish {

	@Override
	public void prepare() {
		System.out.println("Sushi has been prepared");
	}

	@Override
	public void serve() {
		System.out.println("Sushi has been served");
	}

}
