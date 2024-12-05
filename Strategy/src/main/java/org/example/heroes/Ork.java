package org.example.heroes;

import org.example.Gun;
import org.example.Knife;
import org.example.Pistol;


public class Ork extends Character {
    public Ork() {
        super.setGun(new Pistol());
    }

    @Override
    public void fire() {
        super.getGun().fire();
    }
}
