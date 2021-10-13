package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        LinkList<Integer> list = new LinkList<>();

        list.add(5);
        list.add(-1);
        list.add(3);
        list.add(4);
        list.add(8);

        list.printList();

        LinkList<String> listNames = new LinkList<>();

        listNames.add("Ashish");
        listNames.add("Tom");
        listNames.add("Peter");
        listNames.add("Bill");
        listNames.add("Glenn");

        listNames.printList();




    }
}
