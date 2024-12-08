package org.example.facade;

public class Window {
    private boolean opened = false;

    public void open() {
        opened = true;
        System.out.println("Window opened - " + opened);
    }

    public void close() {
        opened = false;
        System.out.println("Window closed - " + opened);
    }
}
