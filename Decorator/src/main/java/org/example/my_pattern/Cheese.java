package org.example.my_pattern;

public class Cheese extends IngredientDecorator {
    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }

    @Override
    public int cost() {
        return 10 + pizza.cost();
    }
}
