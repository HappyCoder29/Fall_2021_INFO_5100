package edu.northeastern.ashish;

import java.util.Random;

public class Producer implements  Runnable{
    @Override
    public void run() {
        Random rand = new Random();
        while(true){

            synchronized (Main.obj){
                Main.items.add(Thread.currentThread().getName() + " item");
            }

            try {
                Thread.sleep(rand.nextInt(25));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
