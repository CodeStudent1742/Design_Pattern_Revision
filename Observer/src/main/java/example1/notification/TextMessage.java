package example1.notification;

import example1.order.Order;

public class TextMessage implements Observer {

    public void update(Order order) {
        System.out.println(" Text - Order number:" + order.getOrderNumber() + " change status to: " + order.getOrderStatus());
    }
}
