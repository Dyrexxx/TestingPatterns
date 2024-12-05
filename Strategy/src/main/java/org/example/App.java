package org.example;

import org.example.heroes.Character;
import org.example.heroes.Human;
import org.example.heroes.Ork;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Character human = new Human();
        Character ork = new Ork();
        human.fire();
        ork.fire();
        human.setGun(new Pistol());
        human.fire();
    }
}
