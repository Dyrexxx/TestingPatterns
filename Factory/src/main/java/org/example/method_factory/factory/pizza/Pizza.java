package org.example.method_factory.factory.pizza;

import org.example.method_factory.abstract_factory.ingredient.cheese.Cheese;
import org.example.method_factory.abstract_factory.ingredient.souse.Souse;

public abstract class Pizza {
    protected String name;
    protected Souse souse;
    protected Cheese cheese;

    public abstract void make();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ". ingredients: " + cheese.getTitle() + ", " + souse.getTitle();
    }
}
