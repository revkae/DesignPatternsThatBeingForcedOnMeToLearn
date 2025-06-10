package Bridge;

public class VulcanRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println("Rendering circle with Vulcan with radius: " + radius);
    }
}
