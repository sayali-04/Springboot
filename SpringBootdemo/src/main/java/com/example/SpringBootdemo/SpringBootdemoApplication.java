package com.example.SpringBootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootdemoApplication.class, args);

		PaymentGateway paymentGateway=context.getBean(PaymentGateway.class);
//		paymentGateway.setType("paytm");
//		paymentGateway.setRetryCount(5);

		System.out.println(paymentGateway.getType());
		System.out.println(paymentGateway.getRetryCount());
	}

}
