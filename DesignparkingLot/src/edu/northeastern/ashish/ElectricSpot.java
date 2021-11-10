package edu.northeastern.ashish;

public class ElectricSpot extends  ParkingSpot{

    public ElectricSpot(String spotID) {
        super(spotID, Main.SpotSize.Compact, true);
    }

}
