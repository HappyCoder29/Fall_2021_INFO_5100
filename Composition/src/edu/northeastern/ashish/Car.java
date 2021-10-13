package edu.northeastern.ashish;

public abstract class Car {
    private String name;
    private Wheels wheels;
    private GearBox gearBox;
    private Seats seats;
    private int speed;

    public String getName() {
        return name;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public Seats getSeats() {
        return seats;
    }

    public String getModelName() {
        return modelName;
    }

    public abstract int getSpeed();

    private String modelName ;

    public Car( String modelName, boolean isAutomatic, int numSeats, boolean hasLeatherSeats){
        this.modelName = modelName;
        wheels = new Wheels(17);
        gearBox = new GearBox(isAutomatic);
        seats = new Seats(numSeats, hasLeatherSeats);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

