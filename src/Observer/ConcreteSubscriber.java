package Observer;

public class ConcreteSubscriber implements Subscriber{
    private String observerState;
    private ConcretePublisher publisher;
    private String name;

    public ConcreteSubscriber(ConcretePublisher publisher, String name) {
        this.publisher = publisher;
        this.name = name;
        publisher.subscribe(this);  // Auto-subscribe
    }

    @Override
    public void setName(String name) {
        System.out.println("Subscriber name set to: " + name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update() {
        observerState = publisher.getState();
        System.out.println("Subscriber named " + name + " updated: " + observerState);
    }
}
