package edu.northeastern.ashish;



public class Main {

    public static void main(String[] args) {

        Person ashish = new Person("Ashish", "Singh", "123-456-7890");
        Person nidhi = new Person("Nidhi", "234-567-8920");

        House h1 = new House(1, "White", 3, 2 );
        House h2 = new House(3, "Blue", 3, 3, nidhi);



        House h3 = new House(3, "Blue", 3, 3, ashish);
        System.out.println();

        House[] houses = {h1, h2, h3};


        for (House h : houses) {
            h.printHouseInformation();
        };


        h2.printHouseInformation(true);

        h1.owner = ashish;
        printOwnerName(h1);
        printOwnerName(h2);

    }

    static void printOwnerName(House house){
        System.out.println("Owner = " + house.owner.getFirst() + ", " + house.owner.getLastName());
    }

}
