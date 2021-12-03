package edu.northeastern.ashish;

import edu.northeastern.ashish.MathLibrary.MathLib;

import java.io.IOException;
import java.util.*;


public class Main {

    private static int counter = 0;
    public static void main(String[] args) {

//        System.out.println(counter);
//        helloWorldFunc();
//
//        Human ashish = new Human("Ashish", 21);
//        Human mark = new Human("Mark", 72);
//        ashish.name  += " Singh";
//        Human pointerAshish = ashish;
//        int localInt = 5;
//        System.out.println(localInt);
//        System.out.println(counter);
//
//        int[] arr = new int[5];
//        arr[0] = 4;
//
//        final int finalInt= 10;

//
//        MathLib lib = new MathLib();
//        int add =  lib.add(1,2);

//        MathLib old = new MathLib();
//        edu.northeastern.ashish.NewMathLib.MathLib newMath = new edu.northeastern.ashish.NewMathLib.MathLib();
//
//        int a = 10;
//        int b = 0;
//        int result = divide(a,b);
//        System.out.println(result);

        Human ashish = new Human("Ashish", 21);
        Human mark = new Human("Mark", 72);
        //Human.occupation = "tester";

        int add = AshishLibrary.add(2,3);

        int add1 = AshishLibrary.substract(2,3);

        listFunctions();


    }

    private static void listFunctions(){

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(-3);
        list.add(4);
        list.add(6);

        Iterator<Integer> iterator = list.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        Human Ashish = new Human("Ashish", 21);
        Human Bill = new Human("Bill", 45);
        Human Tom = new Human("Tom", 23);
        Human Mark = new Human("Mark", 67);
        Human Peter = new Human("Peter", 34);
        Human John = new Human("John", 29);
        Human Jill = new Human("Jill", 44);
        Human Sara = new Human("Sara", 76);
        Human Beth = new Human("Beth", 24);

        List<Human> humans = new LinkedList<>();
        humans.add(Ashish);
        humans.add(Bill);
        humans.add(Tom);
        humans.add(Mark);
        humans.add(Peter);
        humans.add(John);
        humans.add(Jill);
        humans.add(Sara);
        humans.add(Beth);
        for (Human human : humans) {
            System.out.println(human.name + " age : " + human.age);
        }

        humans.sort(new Comparator<Human>() {
            @Override
            public int compare(Human human1, Human human2) {
                return human1.age.compareTo(human2.age);
            }
        });

        System.out.println("**************");
        for (Human human : humans) {
            System.out.println(human.name + " age : " + human.age);
        }


        Stack<Integer> stack = new Stack<>();
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am inside a Runnable run function");
            }
        });
        th.start();
        Thread th1 = new Thread(() -> {
            System.out.println("I am inside a lambda function");
            System.out.println("This is second line");
        });
        th1.start();

        System.out.println();
    }


    private static void stringFunctions(){
        String str =  "Ashish";
        int length = str.length(); // Get length of string
        str = "   Ashish   ";
        str = str.strip(); // strips the string with intends and spaces
        char ch = str.charAt(5);// getting character at index this is zero index
        System.out.println(ch);
        str = str.toLowerCase();// Converts string to lowercase;
        str = str.toUpperCase();// Converts string to upper case
        boolean equal = str.equals("Ashish"); //
        equal = str.equalsIgnoreCase("ashish");
        char[] charArray = str.toCharArray();// converts to char array
        System.out.println( str.substring(2));// gets substring from index to end of string
        System.out.println( str.substring(2,4));// gets the substring from start index to end index
        String[] split = str.split(",");// Splits strings by regular expression
        System.out.println( str.compareToIgnoreCase("ashish") );// 0 if strings are same ignoring case
        System.out.println( str.compareTo("ASHISH") );;// 0 if strings
        boolean isEmpty = str.isEmpty(); // Checks if string is empty
        int index = str.indexOf("Ash"); // Finds the index of a string, character
        index = str.indexOf("Ash", 0);// finds the index from a start idex
        Boolean contains = str.contains("Ash");// returns true or false
        boolean startsWith = str.startsWith("Ash"); // Searched for prefix
        boolean endsWith = str.endsWith("Ash"); // Searched for prefix
        str = str.replace("Ash", "ash");// replaces string with another string
        str = str.replace('a', 'b');// replaces char with another char
    }

    private static void helloWorldFunc(){
        System.out.println("Hello WOrld!");
        Human jill = new Human("Jill", 35);
        System.out.println(counter);

    }

    private static int divide(int a, int b) {
        int result = 0;
        try{
            result = a/b;
        }catch(Exception ex){
            System.out.println(ex.getLocalizedMessage());

        }
        finally {
            System.out.println("This line will execute");
        }
        return result;
    }
}
