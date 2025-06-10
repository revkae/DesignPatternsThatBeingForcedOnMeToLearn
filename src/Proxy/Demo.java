package Proxy;

public class Demo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test_image_1.jpg");
        Image image2 = new ProxyImage("test_image_2.jpg");

        // Image will be loaded from disk
        image1.display();

        // Image will not be loaded from disk, it will use the cached version
        image1.display();

        // Image will be loaded from disk
        image2.display();
    }
}
