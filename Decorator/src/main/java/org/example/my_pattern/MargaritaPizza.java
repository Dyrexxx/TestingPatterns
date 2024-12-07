package org.example.my_pattern;

public class MargaritaPizza extends Pizza {
    public MargaritaPizza() {
        description = "Margarita Pizza";
    }

    @Override
    public int cost() {
        return 80;
    }
}
