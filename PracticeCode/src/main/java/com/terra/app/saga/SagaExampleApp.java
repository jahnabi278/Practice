package com.terra.app.saga;

public class SagaExampleApp {

	public static void main(String[] args) {
		OrderService os = new OrderServiceImpl();
		CartService cs = new CartServiceImpl();
		PaymentService ps = new PaymentServiceImpl();

		OrderSagaManger orderSagaM = new OrderSagaManger(os, cs, ps);
		orderSagaM.startOrderService();
	}

}
