package org.example.heroes;

import org.example.Knife;

public class Human extends Character {

    public Human() {
        super.setGun(new Knife());
    }

    @Override
    public void fire() {
        super.getGun().fire();
    }
}
