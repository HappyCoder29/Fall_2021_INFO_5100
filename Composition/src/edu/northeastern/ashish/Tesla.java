package edu.northeastern.ashish;

public class Tesla extends  Car{
    public Tesla(String modelName, boolean isAutomatic, int numSeats, boolean hasLeatherSeats) {
        super(modelName, isAutomatic, numSeats, hasLeatherSeats);
        super.setName("Tesla");
    }

    public int getSpeed(){
        int speed = 0;
        switch (getGearBox().currentGear){
            case 1 :
                speed = 50;
                break;
            case 2:
                speed = 70;
                break;
            case 3:
                speed = 100;
                break;
            case 4:
                speed = 150;
                break;
            case 5:
                speed = 170;
                break;
            default:
                return 0;
        }
        return speed;
    }

    public void ludicriousMode(){
        setSpeed(200);
    }
}
