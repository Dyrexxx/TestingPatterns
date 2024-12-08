package org.example.method_factory.abstract_factory;

import org.example.method_factory.abstract_factory.ingredient.cheese.Cheese;
import org.example.method_factory.abstract_factory.ingredient.cheese.MoscowCheese;
import org.example.method_factory.abstract_factory.ingredient.souse.MoscowSouse;
import org.example.method_factory.abstract_factory.ingredient.souse.Souse;

public class MoscowAbstractFactory implements IngredientFactory {
    @Override
    public Cheese createCheese() {
        return new MoscowCheese();
    }

    @Override
    public Souse createSouse() {
        return new MoscowSouse();
    }
}
