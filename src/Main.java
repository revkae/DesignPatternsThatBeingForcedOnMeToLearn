import AbstractFactory.Application;

public class Main {
    public static void main(String[] args) {
        Application app = new Application(new AbstractFactory.WindowsFactory());
        app.createUI();
        app.render();
    }
}