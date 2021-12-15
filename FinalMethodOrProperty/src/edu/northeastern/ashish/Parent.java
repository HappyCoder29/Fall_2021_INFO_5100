package edu.northeastern.ashish;

public class Parent {
    public final String finalName;
    public final int finalAge;
    protected String sharedWithChild;

    public Parent(String name, int age){
        this.finalName = name;
        this.finalAge = age;
    }

    public String getFinalName() {
        return finalName;
    }

    public int getFinalAge() {
        return finalAge;
    }

    public String getSharedWithChild() {
        return sharedWithChild;
    }

    public void setSharedWithChild(String sharedWithChild) {
        this.sharedWithChild = sharedWithChild;
    }
}
