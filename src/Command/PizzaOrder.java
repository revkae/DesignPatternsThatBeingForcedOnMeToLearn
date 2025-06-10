package Command;

public class PizzaOrder implements Order {

    private Chef chef;
    private String sauce;

    public PizzaOrder(Chef chef, String sauce) {
        this.chef = chef;
        this.sauce = sauce;
    }

    @Override
    public void execute() {
        chef.cookPizza(sauce);
    }
}
