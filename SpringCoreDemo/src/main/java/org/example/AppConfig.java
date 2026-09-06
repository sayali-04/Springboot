package org.example;

import in.strikes.CartService;
import org.example.payment.CardPayment;
import org.example.payment.PaymentService;
import org.example.payment.UpiPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    @Bean
    public User CreateUser()
    {
        return new User("Sayali",22);
    }
    @Bean
    public CartService createCartService()
    {
        return new CartService();
    }


    //just trial-> we can create object normally using@component.
    @Bean
//    @Primary
    @Qualifier
    public CardPayment createCardPayment()
    {
        return new CardPayment();
    }

    @Bean
    @Qualifier
    public UpiPayment createUpiPayment()
    {
        return new UpiPayment();
    }

    @Bean
    public OrderService crearOrderService(PaymentService paymentService)
    {
        return new OrderService(paymentService);
    }
}
