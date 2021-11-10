package edu.northeastern.ashish;

import java.util.ArrayList;
import java.util.HashMap;

public class ParkingLevel {

    private  static ArrayList<ParkingSpot> listElectricSpots;// 10 electric spots in one level
    private  static ArrayList<ParkingSpot> listCompactSpots; // 50 compact at a level
    private static ArrayList<ParkingSpot> listSUVSpots; // 10 SUV spots in a level


    static HashMap<Integer, ParkingLevel> map = new HashMap<>();

    private ParkingLevel(){
    }

    private  static  Object obj = new Object();

    public static ParkingLevel  getParkingLevel(int id){
        // Lets say we have just 5 levels
        if(id > 5){
            return null;
        }
        if(map.containsKey(id) == false){
            synchronized (obj){
                if ( map.containsKey(id) == false){

                    map.put(id, new ParkingLevel());
                }
            }
        }
        return  map.get(id);
    }


    private static void createSpots(){
        listElectricSpots = new ArrayList<>();
        Integer id = 0;
        for(int i = 0 ; i < 10; i ++){
            listElectricSpots.add(ParkingSpotFactory.createParkingSpot(id.toString() , Main.SpotSize.Electric, true));
            id++;
        }

        listCompactSpots = new ArrayList<>();

        for(int i = 0 ; i < 20; i ++){
            listCompactSpots.add(ParkingSpotFactory.createParkingSpot(id.toString() , Main.SpotSize.Compact, false));
            id++;
        }

        listSUVSpots = new ArrayList<>();

        for(int i = 0 ; i < 20; i ++){
            listSUVSpots.add(ParkingSpotFactory.createParkingSpot(id.toString() , Main.SpotSize.SUV, false));
            id++;
        }
    }



    public boolean isSpotAvailable(ParkingSpot parkingSpot) {
        // implement logic for the parking soots
        if (ElectricSpot.class.equals(parkingSpot.getClass())) {
            for (ParkingSpot spot : listElectricSpots) {
                if(!spot.isOccupied()){
                    return true;
                }
            }

        } else if (CompactSpot.class.equals(parkingSpot.getClass())) {
            for (ParkingSpot spot : listCompactSpots) {
                if(!spot.isOccupied()){
                    return true;
                }
            }
        } else if (SUVSpot.class.equals(parkingSpot.getClass())) {
            for (ParkingSpot spot : listSUVSpots) {
                if(!spot.isOccupied()){
                    return true;
                }
            }
        }
        return false;
    }
}
