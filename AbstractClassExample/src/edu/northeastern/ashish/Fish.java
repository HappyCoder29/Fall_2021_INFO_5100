package edu.northeastern.ashish;

public class Fish  extends  Animal implements iSwim{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(" I am a fish and I make fishy noise");
    }

    @Override
    public void swim(){
        System.out.println("I am swimming");
    }
}
