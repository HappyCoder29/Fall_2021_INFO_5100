package edu.northeastern.ashish;

import com.sun.jdi.CharType;

public class ParkingSpotFactory {

    public static ParkingSpot createParkingSpot(String spotID, Main.SpotSize spotSize, boolean isElectric ){
        if(spotSize == Main.SpotSize.Compact){
            return  new CompactSpot(spotID);
        }
        if(spotSize == Main.SpotSize.SUV){
            return  new SUVSpot(spotID);
        }
        return new ElectricSpot(spotID);
    }
}
