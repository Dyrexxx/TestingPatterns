package org.example.facade;

public class DVDPlayer {
    private String playerName = "DVD Player";
    private boolean starting = false;
    public void play() {
        System.out.println("Playing DVD Player - " + playerName);
    }
    public void start() {
        starting = true;
        System.out.println("start " + starting);
    }
    public void stop() {
        starting = false;
        System.out.println("stop " + starting);
    }
}
