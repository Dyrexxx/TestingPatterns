package org.example.factory;

public abstract class Pizza {
    protected String name;
    void make() {
        System.out.println("Make pizza");
    }

    public String getName() {
        return name;
    }
}
