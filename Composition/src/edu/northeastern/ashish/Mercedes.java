package edu.northeastern.ashish;

public class Mercedes extends  Car{
    public Mercedes( String modelName, boolean isAutomatic, int numSeats, boolean hasLeatherSeats) {
        super( modelName, isAutomatic, numSeats, hasLeatherSeats);
        super.setName("Mercedes");
    }


    public int getSpeed(){
        int speed = 0;
        switch (getGearBox().currentGear){
            case 1 :
                speed = 30;
                break;
            case 2:
                speed = 50;
                break;
            case 3:
                speed = 70;
                break;
            case 4:
                speed = 90;
                break;
            case 5:
                speed = 130;
                break;
            default:
                return 0;
        }
        return speed;
    }


}
