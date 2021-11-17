package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }
}
