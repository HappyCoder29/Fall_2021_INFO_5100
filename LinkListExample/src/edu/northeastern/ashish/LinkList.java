package edu.northeastern.ashish;

public class LinkList <T> {
    public Node head;

    public LinkList(){
        head = null;
    }

    public void addToHead(T data){
        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }

        node.next = head;
        head = node;
    }


    public void addToTail(T data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        Node<T> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;

    }



    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // assuming no cycle
    public int length(){
        Node<T> temp = head;
        int count = 1;
        while(temp != null ){
            temp = temp.next;
            count++;
        }
        return count;

    }

    public void printList(Node<T> node){
        Node temp = node;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public  void reverseList(){

        if(head == null || head.next == null){
            return;
        }
        Node<T> back = null;
        Node<T> mid = head;
        Node<T> front = head.next;

        while(front != null){
            mid.next = back;
            back = mid;
            mid = front;
            front = front.next;
        }
        mid.next = back;
        head = mid;
    }


    public  Node<T> reverseList(Node node){

        if(node == null || node.next == null){
            return node;
        }
        Node<T> back = null;
        Node<T> mid = node;
        Node<T> front = node.next;

        while(front != null){
            mid.next = back;
            back = mid;
            mid = front;
            front = front.next;
        }
        mid.next = back;
        node = mid;
        return node;
    }

    public boolean containsCycle(){
        if(head == null || head.next == null){
            return false;
        }
        Node<T> back = head;
        Node<T> front = head;

        while(front != null){
            front = front.next;
            if(front == null){
                return false;
            }
            front = front.next;
            back = back.next;

            if(front == back){
                return true;
            }

        }
        return false;
    }


    public Node<T> findStartOfCycle(){
        if(head == null || head.next == null){
            return null;
        }
        Node<T> back = head;
        Node<T> front = head;

        while(front != null){
            front = front.next;
            if(front == null){
                return null;
            }
            front = front.next;
            back = back.next;

            if(front == back){
                break;
            }
        }
        if(front == null){
            return null;
        }
        // At this point we know there is a cycle

        front = head;
        while(front != back){
            front = front.next;
            back = back.next;
        }
        return front;
    }

    public Node<T> getNthFromEnd(int n){
        if(head == null || n <= 0){
            return null;
        }
        Node<T> back = head;
        Node<T> front = head;

        for(int i = 0 ; i < n; i ++){
            front = front.next;
            if(front == null){
                return null;
            }
        }
        while(front != null){
            front = front.next;
            back = back.next;
        }
        return back;
    }

    public void deleteNthFromEnd(int n){
        if(head == null || n <= 0){
            return;
        }
        Node<T> back = head;
        Node<T> front = head;

        for(int i = 0 ; i < n+1 ; i ++){
            front = front.next;
            if(front == null){
                return;
            }
        }
        while(front != null){
            front = front.next;
            back = back.next;
        }
        // Back is at N+1 from end
        Node<T> temp = back.next;
        back.next = back.next.next;
        temp = null;
    }

    public Node<T> breakListInHalf(){
        if(head == null || head.next == null){
            return null;
        }
        Node<T> back = head;
        Node<T> front = head;

        // assuming there is no cycle
        while(front != null && front.next != null){
            front = front.next.next;
            if(front == null){break;}
            back = back.next;
        }
        Node secondHalf = back.next;
        back.next = null;
        return secondHalf;

    }

    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node<T> secondHalf = breakListInHalf();
        secondHalf = reverseList(secondHalf);
        Node<T> temp1 = head;
        Node<T> temp2 = secondHalf;
        boolean bPalindrome = true;
        while(temp1 != null && temp2 != null){
            if(temp1.data != temp2.data){
                bPalindrome = false;
                break;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        // put the list back together
        secondHalf = reverseList(secondHalf);
        temp1 = head;
        while(temp1.next != null){
            temp1 = temp1.next;
        }
        temp1.next = secondHalf;
        return bPalindrome;

    }

    public void swapNodesInPair(){
        if(head == null || head.next == null){
            return;
        }
        Node<T> back = head;
        Node<T> front = head.next;

        while(front!= null && front.next != null){
            T data = back.data;
            back.data = front.data;
            front.data = data;

            front = front.next;
            if(front == null){
                break;
            }
            front = front.next;
            back = back.next.next;
        }


    }




}
