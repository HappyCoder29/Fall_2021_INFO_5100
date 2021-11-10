package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Thread(new SimpleRunnable());
        th1.setName("Simple Thread");
        th1.start();


        Thread th2 =new Thread(new SimpleRunnable());
        th2.setName( "Another Simple Thread");
        th2.start();

        Thread th3 = new Thread(new SimpleRunnable());
        th3.setName("Thread3");
        th3.start();

        ComplexObject obj = new ComplexObject(5, "Ashish");
        Thread th4 = new Thread(new SimpleRunnable());
        th4.start();




        for(int i = 0 ; i < 20; i ++){
            System.out.println("I am inside main Loop count = " + i);
            Thread.sleep(200);
        }
        System.out.println("Thread ID = " + Thread.currentThread().getName() );

        System.out.println("exiting main!");

    }


}
