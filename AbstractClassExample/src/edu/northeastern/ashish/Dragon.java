package edu.northeastern.ashish;

public class Dragon extends  Animal  implements  iSwim, iFly {
    public Dragon(String name) {
        super(name);
    }

    @Override
    public void speak() {

    }


    @Override
    public void swim(){
        System.out.println("I am swimming");
    }

    @Override
    public void fly(){
        System.out.println(" I am a bird and I can fly");
    }
}
