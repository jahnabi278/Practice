package com.terra.app.sd.factory;

public class Pizza implements Dish {

	@Override
	public void prepare() {
		System.out.println("Pizza has been prepared");
	}

	@Override
	public void serve() {
		System.out.println("Pizza has been served");
	}

}
