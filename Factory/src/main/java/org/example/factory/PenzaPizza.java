package org.example.factory;

public class PenzaPizza extends Pizza {
    public PenzaPizza() {
        name = "Penza";
    }
    @Override
    void make() {
        System.out.println("Making a Penza");
    }
}
