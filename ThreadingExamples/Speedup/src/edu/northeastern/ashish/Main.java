package edu.northeastern.ashish;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Main {
    public static int[] values = new int[500000000];

    public static long[] portionSum = new long[5];

    public static int portionSize = values.length / 5;
    public static void main(String[] args) {

        generateValues();

        Instant starts = Instant.now();
        long sum = getSum();
        Instant ends = Instant.now();
        System.out.println("Sum = " + sum);
        System.out.println(" Time taken = " + Duration.between(starts, ends).toMillis());


        starts = Instant.now();
        Thread[] threads = new Thread[5];


        for(int i = 0 ; i < threads.length; i ++){
            threads[i] = new Thread(new CalculateSum(i));
            threads[i].start();
        }

        // Wait for threads to finish calculating sum
        for(int i = 0 ; i < threads.length; i ++){
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        sum = 0 ;
        // At this point all the threads have completed
        for(int i = 0; i < 5; i ++){
            sum += portionSum[i];
        }

        ends = Instant.now();
        System.out.println("Sum = " + sum);
        System.out.println(" Time taken by threads = " + Duration.between(starts, ends).toMillis());



    }


    private static void generateValues(){
        Random rand = new Random();
        for(int i = 0 ; i < values.length; i ++){
            values[i] = rand.nextInt(10);
        }
    }

    private static long getSum(){
        long sum = 0;
        for(int i = 0 ; i < values.length; i ++){
            sum +=  values[i];
        }
        return sum;
    }

//
//    static void getSumForPortion(object obj){
//        int portion = (int) obj;
//        long sum = 0;
//        for(int i = portion* portionSize ; i <  portion* portionSize  + portionSize; i ++){
//            sum += values[i];
//        }
//        portionSum[portion] = sum;
//    }
}
