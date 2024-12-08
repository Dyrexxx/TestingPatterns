package org.example.method_factory.factory;

import org.example.method_factory.abstract_factory.IngredientFactory;
import org.example.method_factory.abstract_factory.MoscowAbstractFactory;
import org.example.method_factory.factory.pizza.MoscowPizza;
import org.example.method_factory.factory.pizza.Pizza;

public class MoscowPizzaFactory extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        IngredientFactory ingredientFactory = new MoscowAbstractFactory();
        if (type.equals("moscow")) {
            pizza = new MoscowPizza(ingredientFactory);
        }
        return pizza;
    }
}
