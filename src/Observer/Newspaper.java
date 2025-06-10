package Observer;

public class Newspaper {

    public static void main(String[] args) {
        ConcretePublisher publisher = new ConcretePublisher();
        publisher.setFilename("data.txt");

        ConcreteSubscriber efe = new ConcreteSubscriber(publisher, "Efe");
        ConcreteSubscriber rasim = new ConcreteSubscriber(publisher, "rasim");

        publisher.setState("STATE_1");
        publisher.setState("STATE_2");

        publisher.unsubscribe(rasim);
        publisher.setState("STATE_3");
    }
}
