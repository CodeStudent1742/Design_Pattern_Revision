package example1.notification;

import example1.order.Order;

public interface Observer {

    public void update(Order order);
}
