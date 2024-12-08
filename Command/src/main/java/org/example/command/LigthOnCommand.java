package org.example.command;

import org.example.model.Light;

public class LigthOnCommand implements Command {
    private Light light;

    public LigthOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
        light.twoOn();
    }
}
