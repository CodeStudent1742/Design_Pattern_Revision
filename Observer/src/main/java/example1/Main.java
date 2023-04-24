package example1;

import example1.notification.Email;
import example1.notification.MobileApp;
import example1.notification.TextMessage;
import example1.order.Order;
import example1.order.OrderStatus;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(100L, OrderStatus.REGISTERED);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();

        System.out.println("----------------");

        order.changeOrderStatus(OrderStatus.SEND);

        System.out.println("----------------");

        order.unregisterObserver(textMessage);

        order.changeOrderStatus(OrderStatus.RECEIVED);

    }
}
