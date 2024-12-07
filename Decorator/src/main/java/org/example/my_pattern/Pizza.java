package org.example.my_pattern;

public abstract class Pizza {
    protected String description;

    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    public abstract int cost();
}
