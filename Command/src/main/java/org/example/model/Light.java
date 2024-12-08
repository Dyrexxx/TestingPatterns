package org.example.model;

public class Light {
    private boolean isOn;
    private boolean isTwoOn;

    public Light() {
        this.isOn = false;
        this.isTwoOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isTwoOn() {
        return isTwoOn;
    }

    public void on() {
        isOn = true;
    }

    public void off() {
        isOn = false;
    }
    public void twoOn() {
        isTwoOn = true;
    }
    public void twoOff() {
        isTwoOn = false;
    }
}
