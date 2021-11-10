package edu.northeastern.ashish;

public class Car {
    protected String licencePlate;
    protected String make;
    protected String model;
    protected String year;
    protected String color;

    public Car(String licencePlate, String make, String model, String year, String color){
        this.licencePlate = licencePlate;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }


    public String getLicencePlate() {
        return licencePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}
