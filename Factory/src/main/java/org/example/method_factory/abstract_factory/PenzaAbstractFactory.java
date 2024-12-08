package org.example.method_factory.abstract_factory;

import org.example.method_factory.abstract_factory.ingredient.cheese.Cheese;
import org.example.method_factory.abstract_factory.ingredient.cheese.PenzaCheese;
import org.example.method_factory.abstract_factory.ingredient.souse.PenzaSouse;
import org.example.method_factory.abstract_factory.ingredient.souse.Souse;

public class PenzaAbstractFactory implements IngredientFactory {

    @Override
    public Cheese createCheese() {
        return new PenzaCheese();
    }

    @Override
    public Souse createSouse() {
        return new PenzaSouse();
    }
}
