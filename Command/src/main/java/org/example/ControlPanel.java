package org.example;

import org.example.command.Command;
import org.example.command.NoCommand;

public class ControlPanel {
    Command[] commandsOn;
    Command[] commandsOff;

    public ControlPanel() {
        commandsOn = new Command[2];
        commandsOff = new Command[2];
        for (int i = 0; i < commandsOn.length; i++) {
            commandsOn[i] = new NoCommand();
            commandsOff[i] = new NoCommand();
        }
    }

    public void setCommands(int index, Command commandOn, Command commandOff) {
        commandsOn[index] = commandOn;
        commandsOff[index] = commandOff;
    }

    public void onButtonOnPressed(int button) {
        commandsOn[button].execute();
    }

    public void onButtonOffPressed(int button) {
        commandsOff[button].execute();
    }
}
