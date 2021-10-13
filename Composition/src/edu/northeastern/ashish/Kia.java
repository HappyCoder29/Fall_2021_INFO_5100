package edu.northeastern.ashish;

public class Kia extends  Car{
    public Kia(String modelName, boolean isAutomatic, int numSeats, boolean hasLeatherSeats) {
        super(modelName, isAutomatic, numSeats, hasLeatherSeats);
        super.setName("Kia");
    }

    public int getSpeed(){
        int speed = 0;
        switch (getGearBox().currentGear){
            case 1 :
                speed = 20;
                break;
            case 2:
                speed = 40;
                break;
            case 3:
                speed = 60;
                break;
            case 4:
                speed = 70;
                break;
            case 5:
                speed = 100;
                break;
            default:
                return 0;
        }
        return speed;
    }
}
