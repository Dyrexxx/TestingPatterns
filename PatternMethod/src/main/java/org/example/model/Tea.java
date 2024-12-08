package org.example.model;

public class Tea extends PatternMethod {
    @Override
    protected void two() {
        System.out.println("Добавляем пакетик");
    }

    @Override
    protected void three() {
        System.out.println("Добавляем соль");
    }
}
