package edu.northeastern.ashish;

public class LinkList <T> {
    public Node head;

    public LinkList(){
        head = null;
    }

    public void add(T data){
        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }

        node.next = head;
        head = node;

    }

    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();

    }
}
