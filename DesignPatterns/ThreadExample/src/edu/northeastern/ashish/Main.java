package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        Person Ashish = new Person("Ashish");
        Person Bill = new Person("Bill");
        Person Peter = new Person("Peter");
        Person Mark = new Person("Mark");

        Ashish.start();
        Bill.start();
        Peter.start();
        Mark.start();

        int counter = 15;
        while(true){
            System.out.println(" I am in main thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter--;

        }

    }
}
