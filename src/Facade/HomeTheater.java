package Facade;

public class HomeTheater {

    private final AudioSystem audio;
    private final Projector projector;
    private final DvdPlayer dvd;
    private final Lighting lighting;

    public HomeTheater() {
        this.audio = new AudioSystem();
        this.projector = new Projector();
        this.dvd = new DvdPlayer();
        this.lighting = new Lighting();
    }

    public void watchMovie(String movie) {
        System.out.println("\nPreparing theater for movie...");
        lighting.dim(10);
        projector.down();
        projector.on();
        audio.on();
        audio.setVolume(25);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("\nShutting down theater...");
        dvd.stop();
        dvd.off();
        audio.off();
        projector.off();
        projector.up();
        lighting.on();
    }
}
