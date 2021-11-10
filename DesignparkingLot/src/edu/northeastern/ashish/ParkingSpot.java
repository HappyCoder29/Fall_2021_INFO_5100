package edu.northeastern.ashish;

public class ParkingSpot {
    private String spotID;
    private Main.SpotSize spotSize;
    private boolean isOccupied;
    private boolean isElectric;


    public boolean isElectric() {
        return isElectric;
    }

    public String getSpotID() {
        return spotID;
    }

    public Main.SpotSize getSpotSize() {
        return spotSize;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public ParkingSpot(String spotID, Main.SpotSize spotSize, boolean isElectric){
        this.spotID = spotID;
        this.spotSize = spotSize;
        this.isOccupied = false;
        this.isElectric = isElectric;
    }
}
