package org.example.my_pattern;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Pizza pizza = new MargaritaPizza();
        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza);
        pizza = new Tomato(pizza);
        System.out.println(pizza.getDescription() + " cost: " + pizza.cost());

        Pizza pizza2 = new ItalyPizza();
        pizza2 = new Cheese(pizza2);
        System.out.println(pizza2.getDescription() + " cost: " + pizza2.cost());
    }
}
