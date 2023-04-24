package example1.notification;

import example1.order.Order;

public class Email implements Observer {

    public void update(Order order){
        System.out.println(" Email - Order number:" +order.getOrderNumber() + " change status to: " + order.getOrderStatus());
    }
}
