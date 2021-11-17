package edu.northeastern.ashish;

public class Queue <T>{
    public Node<T> head;
    public Node<T> tail;

    public Queue(){
        head = null;
        tail = null;
    }

    public void add(T data){
        Node<T> node = new Node<>(data);
        if(head == null){
            head = node;
            tail = node;
            return;
        }

        node.next = tail;
        tail.prev = node;
        if(head.prev == null){
            head.prev = node;
        }
        tail = node;

    }

    public T remove(){
        if(head == null){
            return null;
        }
        Node<T> temp = head;
        if(head == tail){
            head = null;
            tail = null;
            return temp.data;
        }
        head = head.prev;
        head.next = null;
        T data = temp.data;
        temp = null;
        return data;
    }

    public T peek(){
        return  head.data;

    }
    public int size(){
        int count = 0;
        Node<T> temp = head;
        while(temp != null){
            temp = temp.prev;
            count++;
        }
        return count;

    }
    public boolean isEmpty(){
        return head == null;
    }
}
