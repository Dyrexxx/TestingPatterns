package org.example.model;

public abstract class PatternMethod {
    public final void make() {
        one();
        two();
        three();
        four();
    }

    protected final void one() {
        System.out.println("Наливаем");
    }

    protected abstract void two();

    protected abstract void three();

    protected final void four() {
        System.out.println("Подаем");
    }

}
