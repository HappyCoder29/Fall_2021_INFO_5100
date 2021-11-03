package edu.northeastern.ashish;

public class Main {

    public static long bankBalance = 0;
    public static Object obj = new Object();

    public static void main(String[] args) {

        Thread university = new Thread(new AddMoneyToMyBank(1, 20));
        university.setName("university");
        Thread microsoft = new Thread(new AddMoneyToMyBank(1, 20));
        microsoft.setName("Microsoft");
        Thread drillMaps = new Thread(new AddMoneyToMyBank(1, 20));
        drillMaps.setName("DrillMaps");

        university.start();
        microsoft.start();
        drillMaps.start();





    }
}
