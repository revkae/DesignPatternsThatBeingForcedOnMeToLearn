package Bridge;

public class OpenGLRenderer implements Renderer{

    @Override
    public void renderCircle(double radius) {
        System.out.println("Rendering circle with OpenGL with radius: " + radius);
    }
}
