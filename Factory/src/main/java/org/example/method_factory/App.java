package org.example.method_factory;

import org.example.method_factory.factory.MoscowPizzaFactory;
import org.example.method_factory.factory.PenzaPizzaFactory;
import org.example.method_factory.factory.pizza.Pizza;
import org.example.method_factory.factory.PizzaStore;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        PizzaStore penza = new PenzaPizzaFactory();
        Pizza pizza1 = penza.orderPizza("penza");
        System.out.println(pizza1);

        PizzaStore moscow = new MoscowPizzaFactory();
        Pizza pizza2 = moscow.orderPizza("moscow");
        System.out.print(pizza2);
    }
}
