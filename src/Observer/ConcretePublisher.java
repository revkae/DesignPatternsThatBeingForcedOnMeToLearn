package Observer;

public class ConcretePublisher extends Publisher {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifySubscribers();
    }
}
