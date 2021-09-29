package edu.northeastern.ashish;

public class Person {
     private String firstName ;
     private String lastName ;
     private String SSN ;

    public String getFirst() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public Person(String firstName, String lastName, String SSN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public Person (String lastName, String SSN){
        this.firstName = "FNU";
        this.lastName = lastName;
        this.SSN = SSN;
    }

}
