package Builder.Normal;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String dough;
    private String sauce;
    private List<String> toppings = new ArrayList<>();

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza [dough=" + dough +
                ", sauce=" + sauce +
                ", toppings=" + toppings + "]";
    }
}
