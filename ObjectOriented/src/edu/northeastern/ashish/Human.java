package edu.northeastern.ashish;

public class Human {
    public String name;
    public Integer age;

    public void eat(){
        System.out.println(name + " is eating food");
    }

    public Human(){
        this.name = "Default name";
        this.age = 0;
    }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }



}
