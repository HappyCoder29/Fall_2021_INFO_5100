package edu.northeastern.ashish;

public class Onion extends  Decorator{
    public Onion(Pizza pizza) {
        super(pizza);
        this.price = 2.0f;
        this.name = " Onion ";
    }
}
