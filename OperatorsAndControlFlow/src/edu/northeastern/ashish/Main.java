package edu.northeastern.ashish;

import java.nio.channels.MulticastChannel;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int add= a + b;
        int subtract = a - b;
        int multiply = a * b;
        int divide = a / b;
        int remainder = a % b;

        System.out.println( "Add = " + add );
        System.out.println( "Subtract = " + subtract );
        System.out.println( "Multiply = " + multiply);
        System.out.println( "Divide = " + divide );
        System.out.println( "Remainder = " + remainder );

         a += 2;
         b -= 1;
         boolean bValue = true;
         bValue = !bValue;
        System.out.println( "a = " + a );
        System.out.println( "b = " + b );
        System.out.println( "Boolean Value = " + bValue );

        a++; // a = a+1
        b--; // b = b-1
        System.out.println( "a = " + a );
        System.out.println( "b = " + b );

        if(bValue) {
            System.out.println("Boolean value is true");
        }

        if ( b == 10 ){
            System.out.println("b's value is greater than 10");
        }else{
            System.out.println("b's value is less than 10");
        }

        // == equal to
        // != not equal t0
        // > greater than
        // >= greater than equal to
        // < less than
        // <= less than equal to

        // if b == 10 and a > 22 then proint some value

        a = 25;
        b += 7;
        if( b == 10 ) {
            if( a > 22 ) {
                System.out.println("b's value is equal to 10 and a's value greater than 22");
            }
        }

        // Conditional operators
        // && and
        // || or condition
        // ? : ternary operator

        b--;
        if( (b == 10) || (a > 22) ){
            System.out.println("b's value is equal to 10 or a's value greater than 22");
        }

        int result = 5;

        if(b > 10){
            result = 10;
        }else{
            result = 12;
        }
        // result = (Conditional expression) ? value 1 : value 2;

        b = 18;
        result = b > 10 ? 10 : 15;


        if( b < 10){
            System.out.println("B is less than 10");
        }else if ( a > 20 ){
            System.out.println("A is greater than 20");
        }


        a = -56;

        a = ~a;
        a = a + 1;
        System.out.println("A's value should be " + a );

        int[] arr = {2,-3,9,4,3};

//       for(int i = 0 ; i < arr.length ; i ++){
//           System.out.println("Value of i = " + i);
//           System.out.println("Value of arr[i] = " + arr[i]);
//       }

        for (int num : arr ) {
            System.out.println("Value = "  + num);
        }

        boolean[] bValues = {true, false, false, true};

        for (boolean booleanValue : bValues) {
            System.out.println(booleanValue);
        }

        int count = 0;

        // While
        while(count > 0){
            System.out.println("Count value = " + count);
            count --;
        }

        // Do while

        do {
            System.out.println("Count value = " + count);
            count --;
        } while( count > 0);

        char[] name = {'A', 's','h','i', 's', 'h'};

        for (Character ch : name) {
            System.out.print(ch);
        }


        String Name = "Ashish";
        String lastName = "Singh";
        System.out.println(Name);

        Name  = Name + lastName;

        printName("Ashish", "Singh");

    }// End of main function


    private static void printName(String firstName, String lastName){


        String fullName = firstName + lastName;
        System.out.println("Name = " + fullName);
    }




}// end of the class
