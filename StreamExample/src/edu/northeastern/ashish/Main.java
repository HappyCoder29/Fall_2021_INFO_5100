package edu.northeastern.ashish;

import javax.imageio.ImageReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String[] strArray = {"A23","a56","A78","A234",
                "B23345","b526","b78","B234",
                "c23","C56","C78","c234"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArray));


        ArrayList<String> bList = new ArrayList<>();

        for (String str : list) {
            if(str.toUpperCase().startsWith("B")){
                bList.add(str);
            }
        }

        for (String str : bList) {
            System.out.println(str);
        }

        System.out.println("***********");
        list.stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.startsWith("B"))
                .sorted()
                .forEach(s -> s.toUpperCase());


        System.out.println("************");


        Stream<String> stream1 = Stream.of("A234", "A213", "B36", "A413");
        Stream<String> stream2 = Stream.of("B244", "A213", "B36", "B4");
        Stream<String> concat = Stream.concat(stream1, stream2);

        List<String> list1 = concat.distinct().collect(Collectors.toList());
        System.out.println();



        Employee Mark = new Employee("Mark Bruce", 67);
        Employee Ashish = new Employee("Ashish Singh", 21);
        Employee John = new Employee("John Mercer", 56);
        Employee Peter = new Employee("Peter Hambling", 21);
        Employee Tom = new Employee("Tom Serecy", 58);
        Employee Sara = new Employee("Sara Smith", 32);
        Employee Beth = new Employee("Beth Clinton", 45);

        ArrayList<Employee> listEmployees = new ArrayList<>();
        listEmployees.add(Ashish);
        listEmployees.add(John);
        listEmployees.add(Peter);
        listEmployees.add(Tom);
        listEmployees.add(Mark);
        listEmployees.add(Sara);
        listEmployees.add(Beth);

        Department hr = new Department("HR");
        Department softwareDevelopment = new Department("Software Development");

        hr.addEmployee(Sara);
        hr.addEmployee(Mark);

        softwareDevelopment.addEmployee(Ashish);
        softwareDevelopment.addEmployee(John);
        softwareDevelopment.addEmployee(Peter);
        softwareDevelopment.addEmployee(Tom);
        softwareDevelopment.addEmployee(Beth);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(softwareDevelopment);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(employee -> System.out.println(employee.getName()));


        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1,e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(employee -> System.out.println(employee.getName() + " Age: " + employee.getAge()));

        Map<Integer, List<Employee>>  groupByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));
        System.out.println();
    }
}
