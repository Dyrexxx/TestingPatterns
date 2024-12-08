package org.example.adapter;

public class UtinDuck implements Duck {
    private int speed = 5;
    @Override
    public void quack() {
         System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("My speed is " + speed);
    }
}
