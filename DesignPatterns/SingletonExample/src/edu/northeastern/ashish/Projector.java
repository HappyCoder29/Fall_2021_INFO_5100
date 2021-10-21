package edu.northeastern.ashish;

public class Projector {

    /*
    * 1. Create a class
    * 2. Make the default constructor private this way people cannot create a new instance by saying Class c = new Class();
    * 3. create a private static instance in the class  "private static Projector _instance;" this _instance is the one which will be treturned
    * 4. Create a getter for this instance
    * 5. lock it inside a synchronized so that only one person can create the instance.
    * */


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
