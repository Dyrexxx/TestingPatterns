package org.example.model;

public class Car {
    private boolean motor;

    public Car() {
        this.motor = false;
    }
    public void onMotor() {
        this.motor = true;
    }
    public void offMotor() {
        this.motor = false;
    }

    public boolean isMotor() {
        return motor;
    }
}
