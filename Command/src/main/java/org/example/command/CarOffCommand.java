package org.example.command;

import org.example.model.Car;

public class CarOffCommand implements Command {
    private Car car;

    public CarOffCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.offMotor();
    }
}
