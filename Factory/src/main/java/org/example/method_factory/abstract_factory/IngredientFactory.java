package org.example.method_factory.abstract_factory;

import org.example.method_factory.abstract_factory.ingredient.cheese.Cheese;
import org.example.method_factory.abstract_factory.ingredient.souse.Souse;

public interface IngredientFactory {
    Cheese createCheese();
    Souse createSouse();

}
