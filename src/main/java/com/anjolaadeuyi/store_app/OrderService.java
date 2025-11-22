package com.anjolaadeuyi.store_app;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {
    private PaymentService paymentService;

    @Autowired
    public OrderService(@Qualifier("stripe") PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService Created");
    }

    @PostConstruct
    public void init(){
        // this is a lifecycle method that is called after the bean is constructed
        // it is used to initialize the bean
        // it is called after the bean is constructed and before the bean is used
        System.out.println("OrderService PostConstruct");
    }

    @PreDestroy
    public void destroy(){
        // this is a lifecycle method that is called before the bean is destroyed
        // it is used to clean up the bean
        // it is called before the bean is destroyed and after the bean is used
        System.out.println("OrderService PreDestroy");
    }

    public void placeOrder () {
        paymentService.processPayment(50);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}