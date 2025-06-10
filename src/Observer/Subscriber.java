package Observer;

public interface Subscriber {
    void setName(String name);
    String getName();
    void update();
}
