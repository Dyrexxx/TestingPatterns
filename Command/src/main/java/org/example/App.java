package org.example;

import org.example.command.CarOffCommand;
import org.example.command.CarOnCommand;
import org.example.command.LightOffCommand;
import org.example.command.LigthOnCommand;
import org.example.model.Car;
import org.example.model.Light;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();
        Light light = new Light();
        Car car = new Car();
        controlPanel.setCommands(0, new LigthOnCommand(light), new LightOffCommand(light));
        controlPanel.setCommands(1, new CarOnCommand(car), new CarOffCommand(car));
        System.out.println(light.isOn());
        System.out.println(light.isTwoOn());
        controlPanel.onButtonOnPressed(0);
        System.out.println(light.isOn());
        System.out.println(light.isTwoOn());
    }
}
