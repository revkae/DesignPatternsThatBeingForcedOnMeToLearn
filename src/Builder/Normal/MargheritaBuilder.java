package Builder.Normal;

public class MargheritaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public void buildDough() {
        pizza.setDough("Thin Crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Tomato");
    }

    @Override
    public void buildToppings() {
        pizza.addTopping("Mozzarella");
        pizza.addTopping("Basil");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}