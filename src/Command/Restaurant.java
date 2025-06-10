package Command;

public class Restaurant {

    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        Order pizzaOrder = new PizzaOrder(chef, "tomato");
        Order pastaOrder = new PastaOrder(chef, "alfredo");

        waiter.takeOrder(pizzaOrder);
        waiter.takeOrder(pastaOrder);

        waiter.submitOrders();
    }
}
