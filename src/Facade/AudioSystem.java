package Facade;

public class AudioSystem {
    public void on() { System.out.println("Audio system ON"); }
    public void setVolume(int level) { System.out.println("Volume set to " + level); }
    public void off() { System.out.println("Audio system OFF"); }
}
