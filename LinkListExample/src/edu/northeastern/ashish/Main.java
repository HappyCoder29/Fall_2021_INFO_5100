package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        LinkList<Integer> list = new LinkList<>();
        list.addToTail(1);
        list.addToTail(2);
        list.addToTail(3);
        list.addToTail(4);
        list.addToTail(5);
        list.addToTail(6);
        list.addToTail(7);

        list.swapNodesInPair();
        list.printList();



        //  System.out.println(list1.isPalindrome());





//        list1.printList();
//        list1.reverseList();
//        list1.printList();

      //  System.out.println(list1.containsCycle());



//        list1.head = createNodeWithLoop();
//        System.out.println(list1.containsCycle());
//
//        Node<Integer> startOfCycle = list1.findStartOfCycle();
//        System.out.println();



//        Node<Integer> node = createNode();
//        node = list1.reverseList(node);
//        list1.printList(node);

    }


    public static Node<Integer> mergeTwoSortedList(Node<Integer> node1, Node<Integer> node2){
        if(node1 == null){
            return node2;
        }
        if(node2 == null){
            return node1;
        }
        Node<Integer> result = null;
        if(node1.data < node2.data){
            result = node1;
            result.next = mergeTwoSortedList(node1.next, node2);
        }else{
            result = node2;
            result.next = mergeTwoSortedList(node1, node2.next);
        }
        return result;
    }

    private static Node<Integer> createNode(){
        Node<Integer> node = new Node<>(5);
        node.next = new Node(4);
        node.next.next = new Node(3);
        node.next.next.next = new Node(2);
        node.next.next.next.next = new Node(1);
        return node;

    }

    private static Node<Integer> createNodeWithLoop(){
        Node<Integer> node = new Node<>(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(6);
        node.next.next.next.next.next.next = new Node(7);
        node.next.next.next.next.next.next.next = new Node(8);
        node.next.next.next.next.next.next.next.next = new Node(9);

        node.next.next.next.next.next.next.next.next.next = node.next.next; // 9 points to 3

        return node;

    }


}
