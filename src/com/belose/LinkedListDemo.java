package com.belose;

public class LinkedListDemo {
    transient int size = 0;
    ListNode head;

    public void addFirst(String data) {
        if(this.head == null) {
            this.head = new ListNode(data);
        } else {
            ListNode currentNode = new ListNode(data);
            currentNode.next = this.head;
            this.head = currentNode;
        }
        size++;
    }

    public int size(){
        return this.size;
    }

    public static void main(String [] args){
        LinkedListDemo demo  = new LinkedListDemo();

        demo.addFirst("sangam");
        demo.addFirst("belose");

        System.out.println(demo.head.data);
        System.out.println(demo.head.next.data);

        System.out.println(demo.size());

    }
}

class ListNode {
    String data;
    ListNode next;

    ListNode(String data) {
        this.data = data;
    }
}
