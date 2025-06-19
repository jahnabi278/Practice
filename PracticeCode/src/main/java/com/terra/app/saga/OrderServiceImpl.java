package com.terra.app.saga;

public class OrderServiceImpl implements OrderService {

	@Override
	public void createOrder() {
		System.out.println("Order created");
	}

	@Override
	public void deleteOrder() {
		System.out.println("Order deleted");
	}

}
