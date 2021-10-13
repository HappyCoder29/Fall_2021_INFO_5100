package edu.northeastern.ashish;

public class Rat extends Animal implements  iSwim{
    public Rat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("I am a Rat and I am squeaking");
    }

    @Override
    public void swim() {
        System.out.println(" I am a Rat and I am swimming");
    }
}
