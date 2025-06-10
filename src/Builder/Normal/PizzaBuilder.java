package Builder.Normal;

public interface PizzaBuilder {
    void buildDough();
    void buildSauce();
    void buildToppings();
    Pizza getPizza();
}
