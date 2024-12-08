package org.example.command;

import org.example.model.Car;

public class CarOnCommand implements Command {
    private Car car;
    public CarOnCommand(Car car) {
        this.car = car;
    }
    @Override
    public void execute() {
        car.onMotor();
    }
}
