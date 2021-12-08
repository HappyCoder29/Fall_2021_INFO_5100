package edu.northeastern.ashish;

import java.util.ArrayList;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {



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

        Function<Employee, String> getLastName = (Employee employee) ->{
            return employee.getName().substring(employee.getName().indexOf(' ') +1);
        };
        System.out.println(getLastName.apply(Sara) );

        Function<Employee, String> getFirstName = (Employee employee) ->{
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };

        System.out.println(getFirstName.apply(Sara) );


        /// Predicates

        IntPredicate greaterThan10 = i -> i > 10;
        IntPredicate lessThan50 = i -> i < 50;
        boolean test = greaterThan10.and(lessThan50).test(45);

        BiPredicate<String, Employee> biPredicate = (str, employee) -> {
            return str.equalsIgnoreCase(getFirstName.apply(employee));
        };

        System.out.println(biPredicate.test("Ashish", Mark) );


        System.out.println("*************");
        for (Employee employee: list) {
            if(employee.getAge() < 40){
                System.out.println(employee.getName() + " Age : " + employee.getAge());
            }
        }
        System.out.println("*************");

        for (Employee employee: list) {
            if(employee.getAge() > 25){
                System.out.println(employee.getName() + " Age : " + employee.getAge());
            }
        }
        Predicate<Employee> lessThan40 = employee -> employee.getAge() < 40;
        Predicate<Employee> greaterThan25 = employee -> employee.getAge() > 25;


        printEmployeesByAge(list, "Employees less than 40", lessThan40);
        printEmployeesByAge(list, "Employees greater than 25", greaterThan25);



        BiFunction<Employee, String, String> biFunction = (employee, str) -> {
            if(employee.getName().equalsIgnoreCase(str) ){
                return "Employee name matches";
            }
           return "Employee Name does not match";
        };

        System.out.println(biFunction.apply(Ashish, "Ashish Singh") );



        System.out.println();

    }

    // Predicate
    private static void printEmployeesByAge(ArrayList<Employee> list, String strCondition,
                                            Predicate<Employee> ageCondition){

        System.out.println(strCondition);
        System.out.println("*************");

        for (Employee employee: list) {
            if(ageCondition.test(employee)){
                System.out.println(employee.getName() + " Age : " + employee.getAge());
            }
        }
    }
}
