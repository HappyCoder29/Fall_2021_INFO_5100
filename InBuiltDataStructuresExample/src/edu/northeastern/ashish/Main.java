package edu.northeastern.ashish;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        priorityQueueExample();
    }



    private static void listExample(){
        List<Integer> list1 = new LinkedList<>();
        list1.add(20);
        list1.add(21);
        list1.add(22);



        List<Integer> list = new LinkedList<>();
        list.add(5);// adding values to the list
        list.add(7);
        list.add(8);
        list.add(1, -4);
        list.addAll(list1);
        int valueAt = list.get(2);
        list.addAll(1, list1);
        System.out.println(list.contains(20));
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        List<Person> listPerson = new LinkedList<>();
        listPerson.add(new Person(55, "John"));
        listPerson.add(new Person(22, "Sara"));
        listPerson.add(new Person(45, "Peter"));
        listPerson.add(new Person(31, "Bill"));
        listPerson.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.age> o2.age){
                    return 1;
                }else if(o1.age < o2.age){
                    return  -1;
                }else{
                    return 0;
                }
            }
        });

        Iterator<Person> iterator = listPerson.iterator();
        Person per1 = iterator.next();
        Person per2 = iterator.next();



        System.out.println();


    }


    private static void priorityQueueExample(){
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        queue.add(12);
        queue.add(24);
        queue.add(6);
        queue.add(-1);
        queue.add(15);
        queue.add(32);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.peek());


    }
}
