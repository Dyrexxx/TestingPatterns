package org.example.adapter;

public class DuckCarAdapter implements Car {
    private Duck duck;

    public DuckCarAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void signal() {
        duck.quack();
    }

    @Override
    public void drive() {
        duck.fly();
    }
}
