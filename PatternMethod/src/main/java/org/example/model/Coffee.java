package org.example.model;

public class Coffee extends PatternMethod {
    @Override
    protected void two() {
        System.out.println("Добавляем кофеин");
    }

    @Override
    protected void three() {
        System.out.println("Добавляем сахар");
    }
}
