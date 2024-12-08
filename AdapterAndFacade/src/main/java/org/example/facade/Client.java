package org.example.facade;

public class Client implements facade {
    private DVDPlayer dvdPlayer;
    private TV tv;
    private Window window;

    public Client(DVDPlayer dvdPlayer, TV tv, Window window) {
        this.dvdPlayer = dvdPlayer;
        this.tv = tv;
        this.window = window;
    }

    @Override
    public void on() {
        dvdPlayer.play();
        dvdPlayer.start();

        tv.start();

        window.open();
    }

    @Override
    public void off() {
        dvdPlayer.stop();
        tv.stop();
        window.close();
    }
}
