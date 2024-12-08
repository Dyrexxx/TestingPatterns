package org.example;

import org.example.model.Coffee;
import org.example.model.PatternMethod;
import org.example.model.Tea;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        PatternMethod tea = new Tea();
        PatternMethod coffee = new Coffee();
        tea.make();
        coffee.make();
    }
}
