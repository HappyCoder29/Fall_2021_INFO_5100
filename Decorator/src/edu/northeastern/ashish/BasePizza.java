package edu.northeastern.ashish;

public class BasePizza extends Pizza {
    private float price = 10.0f;
    private String name = "Pizza Base";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getPrice() {
        return price;
    }
}
