package edu.northeastern.ashish;

public class CompactSpot extends  ParkingSpot{
    public CompactSpot(String spotID) {
        super(spotID, Main.SpotSize.Compact, false);
    }
}
