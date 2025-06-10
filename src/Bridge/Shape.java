package Bridge;

public abstract class Shape {

    public Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    abstract public void draw();
}
