package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        BasePizza base = new BasePizza();
        Onion onion = new Onion(base);
        GreenPepper greenPepper = new GreenPepper(onion);
        Chicken chicken = new Chicken(greenPepper);

        System.out.println(chicken.getName());
        System.out.println(chicken.getPrice());


    }
}
