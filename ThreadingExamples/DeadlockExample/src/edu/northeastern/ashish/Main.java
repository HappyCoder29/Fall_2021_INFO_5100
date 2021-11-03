package edu.northeastern.ashish;

public class Main {

    public static Object obj1 = new Object();
    public static Object obj2 = new Object();


    public static void main(String[] args) {

        Thread th1 = new Thread(new OperationA());
        Thread th2 = new Thread(new OperationB());

        th1.start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th2.start();

    }
}
