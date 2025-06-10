package Builder.Normal;

public class Director {
    private PizzaBuilder builder;

    public Director(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void makePizza() {
        builder.buildDough();
        builder.buildSauce();
        builder.buildToppings();
    }

    public Pizza getPizza() {
        return builder.getPizza();
    }
}