package Command;

public class PastaOrder implements Order {

    private Chef chef;
    private String sauce;

    public PastaOrder(Chef chef, String sauce) {
        this.chef = chef;
        this.sauce = sauce;
    }

    @Override
    public void execute() {
        chef.cookPasta(sauce);
    }
}
