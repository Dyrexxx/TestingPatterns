package org.example.facade;

public class TV {
    private boolean on = false;
    public void start() {
        on = true;
        System.out.println("TV is on - " + on );
    }
    public void stop() {
        on = false;
        System.out.println("TV is off - " + on );
    }
}
