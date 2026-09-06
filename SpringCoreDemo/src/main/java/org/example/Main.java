package org.example;

import in.strikes.CartService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

//        PaymentService service=new PaymentService();
//        OrderService order=new OrderService(service);
//        order.placeOrder();

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order=context.getBean(OrderService.class);
        order.placeOrder();

//        CartService cart=new CartService();
//        cart.addToCart();

//        User user=context.getBean(User.class);
//        System.out.println(user.getName());
//
//        CartService cart=context.getBean(CartService.class);
//        cart.addToCart();

    }
}