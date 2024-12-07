package org.example.my_pattern;

public class Tomato extends IngredientDecorator{
    private Pizza pizza;
    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }

    @Override
    public int cost() {
        return 20 + pizza.cost();
    }
}
