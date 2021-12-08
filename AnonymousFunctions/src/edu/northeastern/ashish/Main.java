package edu.northeastern.ashish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

//        Thread th = new Thread(new SimpleThread());
//        th.start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Inside the main class");
//            }
//        }).start();
//
//        // Lambda function with just one line. No semicolon is required
//        new Thread(()-> System.out.println("Inside an lambda function")).start();
//        // Lambda function with multiple lines. All the code should be inside curly braces
//        new Thread(()-> {
//            System.out.println("Inside an lambda function");
//            System.out.println("This is second line");
//            System.out.println("This is third line");
//        }).start();

        Employee Mark = new Employee("Mark Bruce", 67);
        Employee Ashish = new Employee("Ashish Singh", 21);
        Employee John = new Employee("John Mercer", 56);
        Employee Peter = new Employee("Peter Hambling", 35);
        Employee Tom = new Employee("Tom Serecy", 58);
        Employee Sara = new Employee("Sara Smith", 32);
        Employee Beth = new Employee("Beth Clinton", 45);

        ArrayList<Employee> list = new ArrayList<>();
        list.add(Ashish);
        list.add(John);
        list.add(Peter);
        list.add(Tom);
        list.add(Mark);
        list.add(Sara);
        list.add(Beth);

//        Collections.sort(list, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

      //  Collections.sort(list, ( employee1,  employee2) -> employee1.getName().compareTo(employee2.getName()));
        Collections.sort(list, (employee1, employee2) -> employee1.getAge().compareTo(employee2.getAge()));

      //  Collections.sort(list, (employee1, employee2)->employee2.getStartDate().compareTo(employee1.getStartDate()));
        for (Employee employee : list) {
            System.out.println(employee.getName() + ", Age: " + employee.getAge());
        }


        String upperCased = doStringStuff(new StringFunction() {
            @Override
            public String ConvertUppercaseAndConcatenate(String str1, String str2) {
                return str1.toUpperCase() + " " + str2.toUpperCase();
            }
        }, "Ashish", "Singh");

        StringFunction sf = (str1, str2) -> str1.toUpperCase() + " " + str2.toUpperCase();
        upperCased = doStringStuff(sf, "Ashish", "Singh");

        System.out.println(upperCased);


    }

    public static  String doStringStuff(StringFunction sf, String str1, String str2 ){
        return sf.ConvertUppercaseAndConcatenate(str1, str2);
    }
}
