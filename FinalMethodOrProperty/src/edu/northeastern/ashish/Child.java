package edu.northeastern.ashish;

public class Child extends  Parent{
    String childName;
    int childAge;

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public int getChildAge() {
        return childAge;
    }

    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }

    public Child(String name, int age){
        super("",0);
        this.childName = name;
        this.childAge = age;
    }
}
