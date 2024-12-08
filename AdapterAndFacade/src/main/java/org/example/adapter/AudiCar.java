package org.example.adapter;

public class AudiCar implements Car {
    @Override
    public void signal() {
        System.out.println("Audi car signal");
    }

    @Override
    public void drive() {
        System.out.println("Гоняем на ебической скорости");
    }
}
