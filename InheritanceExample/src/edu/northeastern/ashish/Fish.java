package edu.northeastern.ashish;

public class Fish extends  Animal{

    public Fish(String name, int age, double weight, boolean isMammal, boolean isVegetarian) {
        super(name, age, weight, isMammal, isVegetarian);
    }

    public void breathe(){
        System.out.println(" I ma super cool and can breathe underwater");
    }
}
