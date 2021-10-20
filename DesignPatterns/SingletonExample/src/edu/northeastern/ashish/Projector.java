package edu.northeastern.ashish;

public class Projector {

    private static Projector _instance;
    private Projector(){} // No one can create an instance through default constructor

    private static Object obj = new Object();

    public String name = "Default";
    public static Projector getInstance(){

        if(_instance == null){ // Double locking
            synchronized (obj){
                if( _instance == null){
                    _instance = new Projector();
                }
            }
        }
        return  _instance;
    }

}
