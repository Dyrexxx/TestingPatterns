package org.example.heroes;

import lombok.Getter;
import lombok.Setter;
import org.example.Gun;

@Setter
@Getter
public abstract class Character {
    private Gun gun;
    public abstract void fire();
}
