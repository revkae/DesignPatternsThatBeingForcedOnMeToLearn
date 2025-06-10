package Command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<Order> orders;

    public Waiter() {
        this.orders = new ArrayList<>();
    }

    public void takeOrder(Order order) {
        orders.add(order);
        System.out.println("Order taken: " + order.getClass().getSimpleName());
    }

    public void submitOrders() {
        System.out.println("Submitting orders...");
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
