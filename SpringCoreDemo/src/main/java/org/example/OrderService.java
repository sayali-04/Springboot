package org.example;

import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {

   // @Autowired
    private PaymentService payment;

    public OrderService(@Qualifier("cp") PaymentService payment){

        this.payment=payment;
    }
    public void placeOrder(){
        payment.pay();
        System.out.println("Order placed");
    }
}
