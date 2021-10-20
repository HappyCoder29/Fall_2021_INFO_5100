package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        Projector proj = Projector.getInstance();
        Projector proj1 = Projector.getInstance();
        proj.name = "Projector in room Whitbey";
        System.out.println(proj1.name);


    }
}
