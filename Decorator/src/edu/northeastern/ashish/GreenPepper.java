package edu.northeastern.ashish;

public class GreenPepper extends Decorator{
    public GreenPepper(Pizza pizza) {
        super(pizza);
        this.price = 1.0f;
        this.name = "Green Pepper";
    }
}
