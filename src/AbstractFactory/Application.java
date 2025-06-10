package AbstractFactory;

public class Application {

    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory(); // or MacOSFactory
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }
}
