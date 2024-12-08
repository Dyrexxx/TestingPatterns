package org.example.facade;

public class App {
    public static void main(String[] args) {
        Client client = new Client(new DVDPlayer(), new TV(), new Window());
        client.on();
        client.off();
    }
}
