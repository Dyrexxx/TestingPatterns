package org.example.method_factory.factory;

import org.example.method_factory.factory.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.make();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
