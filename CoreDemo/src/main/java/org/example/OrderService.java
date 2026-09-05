package org.example;

import org.example.Notification.EmailService;
import org.example.Notification.NotificationService;
import org.example.Notification.SmsService;

public class OrderService {

    NotificationService notification;

    OrderService(NotificationService notification) {
        this.notification = notification;
    }
    public void placeOrder(){
        System.out.println("Order Placed!!");
        notification.sendNotification();

    }
}
