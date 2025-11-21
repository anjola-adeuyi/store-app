package com.anjolaadeuyi.store_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreAppApplication {

	public static void main(String[] args) {

//		SpringApplication.run(StoreAppApplication.class, args);

		var stripeOrderService = new OrderService(new StripePaymentService());
		stripeOrderService.placeOrder();

		var paypalOrderService = new OrderService(new PayPalPaymentService());
		paypalOrderService.placeOrder();
	}
}
