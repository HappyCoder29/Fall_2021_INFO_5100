package edu.northeastern.ashish;

public class Chicken extends  Decorator{
    public Chicken(Pizza pizza) {
        super(pizza);
        this.price = 3.0f;
        this.name = " Chicken ";
    }
}
