package com.anjolaadeuyi.store_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreAppApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(StoreAppApplication.class, args);
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();

//		var stripeOrderService = new OrderService(new StripePaymentService());
//		stripeOrderService.placeOrder();
//
//		var paypalOrderService = new OrderService(new PayPalPaymentService());
//		paypalOrderService.placeOrder();
//
//		paypalOrderService.setPaymentService(new PayPalPaymentService());

		var manager = context.getBean(NotificationManager.class);
		manager.sendNotification("testing notification...");
	}
}
