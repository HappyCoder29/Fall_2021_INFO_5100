package edu.northeastern.ashish;

import java.util.Random;

public class Consumer implements Runnable{
    @Override
    public void run() {

        Random rand = new Random();
        while(true){
            if(Main.items.size() > 0 ){
                synchronized (Main.obj){
                    String item = Main.items.remove(0);
                    System.out.println(Thread.currentThread().getName() + " consumed item : " + item);
                }

                try {
                    Thread.sleep(rand.nextInt(20));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
