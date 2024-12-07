package org.example.my_pattern;

public class ItalyPizza extends Pizza {
    public ItalyPizza() {
        description = "Italy Pizza";
    }

    @Override
    public int cost() {
        return 100;
    }
}
