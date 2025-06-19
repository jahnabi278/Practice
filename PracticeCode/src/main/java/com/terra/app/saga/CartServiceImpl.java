package com.terra.app.saga;

public class CartServiceImpl implements CartService {

	@Override
	public void addToCart() {
		System.out.println("Item added to cart");
	}

	@Override
	public void releaseFromCart() {
		System.out.println("Item Removed fro cart");
	}

}
