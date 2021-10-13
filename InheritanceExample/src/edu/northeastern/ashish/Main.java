package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        Rhino rhino = new Rhino("Super Rhino",2, 450, true, true);
        rhino.eat();
        rhino.getName();
        System.out.println(rhino.getWeight());

        rhino.breathe();

        Fish fish = new Fish("Wanda", 5, 3, false, true);
        fish.breathe();
    }
}
