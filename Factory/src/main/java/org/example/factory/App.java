package org.example.factory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        PizzaStore penza = new PenzaPizzaFactory();
        Pizza pizza1 = penza.orderPizza("penza");
        System.out.print(pizza1.getName() + ": ");
        pizza1.make();

        PizzaStore moscow = new MoscowPizzaFactory();
        Pizza pizza2 = moscow.orderPizza("moscow");
        System.out.print(pizza2.getName() + ": ");
        pizza2.make();
    }
}
