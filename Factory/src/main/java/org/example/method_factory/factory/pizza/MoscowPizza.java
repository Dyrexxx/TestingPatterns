package org.example.method_factory.factory.pizza;

import org.example.method_factory.abstract_factory.IngredientFactory;

public class MoscowPizza extends Pizza {
    private IngredientFactory ingredientFactory;

    public MoscowPizza(IngredientFactory ingredientFactory) {
        name = "Moscow";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void make() {
        cheese = ingredientFactory.createCheese();
        souse = ingredientFactory.createSouse();
    }
}
