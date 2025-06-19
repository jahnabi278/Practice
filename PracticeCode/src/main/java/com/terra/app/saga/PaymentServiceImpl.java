package com.terra.app.saga;

public class PaymentServiceImpl implements PaymentService {

	@Override
	public void deductAmount() {
		System.out.println("Failed to deduct amount ");
		throw new RuntimeException("Insufficient fund");
	}

}
