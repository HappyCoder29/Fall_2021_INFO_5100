package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        Parent parent = new Parent("Parent", 35);
        Child child = new Child("Child", 10);
        child.sharedWithChild = "Shared";

    }
}
