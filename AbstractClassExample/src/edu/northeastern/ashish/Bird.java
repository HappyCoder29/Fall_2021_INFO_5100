package edu.northeastern.ashish;

public class Bird  extends  Animal implements iFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("I am chirping");
    }

    @Override
    public void fly(){
        System.out.println(" I am a bird and I can fly");
    }
}
