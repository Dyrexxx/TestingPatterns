package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        MySingleton dima1 = MySingleton.getInstance();
        dima1.setValue(23);
        System.out.println(dima1.getValue());
        MySingleton dima2 = MySingleton.getInstance();
        dima2.setValue(13);
        System.out.println(dima2.getValue());
        System.out.println(dima1.getValue());
    }
}
