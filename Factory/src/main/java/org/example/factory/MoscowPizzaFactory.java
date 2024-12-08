package org.example.factory;

public class MoscowPizzaFactory extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("moscow")) {
            pizza = new MoscowPizza();
        }

        return pizza;
    }
}
