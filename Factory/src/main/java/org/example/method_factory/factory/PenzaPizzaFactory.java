package org.example.method_factory.factory;

import org.example.method_factory.abstract_factory.IngredientFactory;
import org.example.method_factory.abstract_factory.PenzaAbstractFactory;
import org.example.method_factory.factory.pizza.PenzaPizza;
import org.example.method_factory.factory.pizza.Pizza;

public class PenzaPizzaFactory extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        IngredientFactory ingredientFactory = new PenzaAbstractFactory();
        if(type.equals("penza")){
            pizza = new PenzaPizza(ingredientFactory);
        }

        return pizza;
    }
}
