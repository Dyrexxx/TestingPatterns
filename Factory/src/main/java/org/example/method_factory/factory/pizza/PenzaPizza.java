package org.example.method_factory.factory.pizza;

import org.example.method_factory.abstract_factory.IngredientFactory;

public class PenzaPizza extends Pizza {
    private IngredientFactory ingredientFactory;

    public PenzaPizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Penza";
    }

    @Override
    public void make() {
        cheese = ingredientFactory.createCheese();
        souse = ingredientFactory.createSouse();
    }
}
