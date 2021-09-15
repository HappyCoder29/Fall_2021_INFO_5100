package edu.northeastern.ashish;

import com.sun.jdi.IntegerType;

public class Main {

    public static void main(String[] args) {


        int numOfStudentsInClass = 62;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        Integer testVal = 56;

        System.out.println("Max Value of Integer = " + max);
        System.out.println("Min Value of Integer = " + min);

        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;

        System.out.println("Max Value of Short = " + maxShort);
        System.out.println("Min Value of Short = " + minShort);

        float myFloat = 5.23f;
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        System.out.println("My Float  = " + myFloat);

        System.out.println("Max Value of Float = " + maxFloat);
        System.out.println("Min Value of Float = " + minFloat);

        double myDouble = 5.23d;
        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        System.out.println("My Double  = " + myDouble);

        System.out.println("Max Value of Double = " + maxDouble);
        System.out.println("Min Value of Double = " + minDouble);

        char ch = '\u00A9';

        System.out.println("My character = " + ch);

        boolean bTestValue = true;
        System.out.println("boolean value = " +  bTestValue);
        bTestValue = !bTestValue;
        System.out.println("boolean value = " +  bTestValue);

        long myLong = 5;
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println("My Long  = " + myLong);
        System.out.println("Max Value of Long = " + maxLong);
        System.out.println("Min Value of Long = " + minLong);


        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        System.out.println("Max Value of Byte = " + maxByte);
        System.out.println("Min Value of Byte = " + minByte);


        System.out.println("");




    }




}
