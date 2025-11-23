package com.anjolaadeuyi.store_app;

import com.anjolaadeuyi.store_app.common.NotificationManager;
import com.anjolaadeuyi.store_app.common.OrderService;
//import com.anjolaadeuyi.store_app.common.User;
import com.anjolaadeuyi.store_app.common.UserService;
import com.anjolaadeuyi.store_app.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreAppApplication {

	public static void main(String[] args) {

        var user = User.builder().name("John").email("").password("").build();
        System.out.println(user.getName());

//		ApplicationContext context = SpringApplication.run(StoreAppApplication.class, args);
//		var orderService = context.getBean(OrderService.class);
//		orderService.placeOrder();

//		var stripeOrderService = new OrderService(new StripePaymentService());
//		stripeOrderService.placeOrder();
//
//		var paypalOrderService = new OrderService(new PayPalPaymentService());
//		paypalOrderService.placeOrder();
//
//		paypalOrderService.setPaymentService(new PayPalPaymentService());

//		var manager = context.getBean(NotificationManager.class);
//		manager.sendNotification("testing notification...", "email@gmail.com");
//
//		var userService = context.getBean(UserService.class);
//		userService.registerUser(new User(1L, "email@gmail.com", "123456", "John"));
//		userService.registerUser(new User(1L, "email2@gmail.com", "123456", "John"));
	}
}
