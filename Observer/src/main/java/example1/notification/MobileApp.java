package example1.notification;

import example1.order.Order;

public class MobileApp implements Observer {

    public void update(Order order) {
        System.out.println(" Mobile - Order number:" + order.getOrderNumber() + " change status to: " + order.getOrderStatus());
    }
}
