package Facade;

public class Owner {
    public static void main(String[] args) {
        HomeTheater theater = new HomeTheater();

        theater.watchMovie("Inception");
        System.out.println("\n=== Enjoying movie! ===\n");
        theater.endMovie();
    }
}
