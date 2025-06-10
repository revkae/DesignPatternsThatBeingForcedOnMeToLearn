package Builder.Normal;

public class PepperoniBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public void buildDough() {
        pizza.setDough("Pan Baked");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Spicy Tomato");
    }

    @Override
    public void buildToppings() {
        pizza.addTopping("Pepperoni");
        pizza.addTopping("Cheese");
        pizza.addTopping("Mushrooms");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}