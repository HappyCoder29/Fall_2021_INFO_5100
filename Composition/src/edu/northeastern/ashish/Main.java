package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        Car mercedes = new Mercedes("C300" , true, 5, true);
        Car kia = new Kia(" Sedona", true, 5, false);
        Car tsla = new Tesla( "Roadster", true, 2, false);

        mercedes.getGearBox().setCurrentGear(1);
        System.out.println(mercedes.getSpeed());

        kia.getGearBox().setCurrentGear(2);
        System.out.println(kia.getSpeed());

    }
}
