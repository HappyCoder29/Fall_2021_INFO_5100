package edu.northeastern.ashish;

public class GearBox {
    boolean isAutomatic;
    int currentGear;

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public GearBox(boolean isAutomatic){
        this.isAutomatic = isAutomatic;
    }

}
