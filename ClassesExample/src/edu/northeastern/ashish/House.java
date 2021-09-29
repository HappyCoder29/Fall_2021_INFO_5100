package edu.northeastern.ashish;

public class House {
    public int houseNumber;
    public String color;
    public int numOfBedrooms;
    public double numOfBaths;
    private boolean isSold;
    public Person owner;

    public House(int houseNumber, String color, int numOfBaths, int numOfBedrooms){
        this.houseNumber = houseNumber;
        this.color = color;
        this.numOfBaths = numOfBaths;
        this.numOfBedrooms = numOfBedrooms;
        this.owner = new Person("Unknown", "Unknown", "123-456-7890");
    }

    public  House(int houseNumber, String color, int numOfBaths, int numOfBedrooms, Person owner){
        this.houseNumber = houseNumber;
        this.color = color;
        this.numOfBaths = numOfBaths;
        this.numOfBedrooms = numOfBedrooms;
        this.owner = owner;
    }

    public void printHouseInformation(){
        System.out.println("House number = " + houseNumber);
        System.out.println("House Color = " + color);
        System.out.println("Number of Bedrooms = " + numOfBedrooms);
        System.out.println("Number of Bathrooms number = " + numOfBaths);
    }


    public void printHouseInformation(boolean printOwnerName){
        System.out.println("House number = " + houseNumber);
        System.out.println("House Color = " + color);
        System.out.println("Number of Bedrooms = " + numOfBedrooms);
        System.out.println("Number of Bathrooms number = " + numOfBaths);
        if(printOwnerName){
            System.out.println("Owner = " + owner.getFirst() + ", " + owner.getLastName());
        }
    }


}
