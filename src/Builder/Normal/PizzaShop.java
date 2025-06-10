package Builder.Normal;

public class PizzaShop {
    public static void main(String[] args) {
        PizzaBuilder margheritaBuilder = new MargheritaBuilder();
        PizzaBuilder pepperoniBuilder = new PepperoniBuilder();

        Director director = new Director(margheritaBuilder);

        director.makePizza();
        Pizza margherita = director.getPizza();
        System.out.println("Margherita: " + margherita);

        director = new Director(pepperoniBuilder);
        director.makePizza();
        Pizza pepperoni = director.getPizza();
        System.out.println("Pepperoni: " + pepperoni);

        PizzaBuilder customBuilder = new MargheritaBuilder();
        customBuilder.buildDough();
        customBuilder.buildSauce();
        customBuilder.buildToppings();
        customBuilder.getPizza().addTopping("Olives");
        Pizza customPizza = customBuilder.getPizza();
        System.out.println("Custom: " + customPizza);
    }
}
