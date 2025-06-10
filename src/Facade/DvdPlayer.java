package Facade;

public class DvdPlayer {
    public void on() { System.out.println("DVD player ON"); }
    public void play(String movie) { System.out.println("Playing '" + movie + "'"); }
    public void stop() { System.out.println("DVD player STOPPED"); }
    public void off() { System.out.println("DVD player OFF"); }
}
