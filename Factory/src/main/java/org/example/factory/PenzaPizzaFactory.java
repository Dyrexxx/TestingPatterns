package org.example.factory;

public class PenzaPizzaFactory extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("penza")){
            pizza = new PenzaPizza();
        }

        return pizza;
    }
}
