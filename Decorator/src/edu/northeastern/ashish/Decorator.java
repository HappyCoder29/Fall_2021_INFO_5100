package edu.northeastern.ashish;

public class Decorator extends  Pizza{
    protected Pizza basePizza = null;
    protected  String name = "Decorator";
    protected float price = 0.0f;

    public Decorator(Pizza pizza){
        basePizza = pizza;
    }


    @Override
    public String getName() {
        return basePizza.getName() + ", " + name;
    }

    @Override
    public float getPrice() {
        return price + basePizza.getPrice();
    }
}
