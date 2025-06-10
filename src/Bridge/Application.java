package Bridge;

public class Application {

    public static void main(String[] args) {
        Renderer openglRenderer = new VulcanRenderer();
        Shape circle = new Circle(openglRenderer, 5.0);

        circle.draw();
    }
}
