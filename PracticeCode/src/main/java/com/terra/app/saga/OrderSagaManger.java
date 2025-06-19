package com.terra.app.saga;

public class OrderSagaManger {

	OrderService orderService;
	CartService cartService;
	PaymentService paymentService;

	public OrderSagaManger(OrderService os, CartService cs, PaymentService ps) {
		this.orderService = os;
		this.cartService = cs;
		this.paymentService = ps;
	}

	public void startOrderService() {
		try {
			orderService.createOrder();
			cartService.addToCart();
			paymentService.deductAmount();// throw exception
			System.out.println("Order Placed successfully");

		} catch (Exception e) {
			cartService.releaseFromCart();
			orderService.deleteOrder();
			System.out.println("Saga compensation completed");
		}

	}
}
