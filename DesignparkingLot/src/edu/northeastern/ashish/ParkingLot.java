package edu.northeastern.ashish;

import java.util.ArrayList;
import java.util.HashMap;

public class ParkingLot {

    public ParkingLot(){

    }

}

/*
* public class Projector {

    static HashMap<Integer, Projector> projectors = new HashMap<>();

    private Projector(){
    }


    private  static  Object obj = new Object();

    public static Projector  getProjector(Integer id){

        if(projectors.containsKey(id) == false){
            synchronized (obj){
                if ( projectors.containsKey(id) == false){
                    projectors.put(id, new Projector());
                }
            }
        }
        return  projectors.get(id);
    }
}
*
* */
