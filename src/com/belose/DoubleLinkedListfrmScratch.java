package com.belose;

public class DoubleLinkedListfrmScratch<E> {

    Node<E> head;
    private int size;

    public void addFirst(E data) {
        if (this.head == null) {
            this.head = new Node<>(data);
        } else {
            Node<E> currentNode = new Node<>(data);
            currentNode.next = this.head;
            //set previous for current node
            this.head.previous = currentNode;
            //set current node as head
            this.head = currentNode;
        }
        size++;
    }

    public void addLast(E data) {
        Node<E> currentNode = new Node<>(data);

        if (this.head == null) {
            this.head = currentNode;
        } else {
            Node<E> temp = this.head;
            // To reach last node
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = currentNode;
            currentNode.previous = temp;
        }
        size++;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Node<E> temp = this.head;
        for (int i = 0; i < size; i++) {
            builder.append(temp.data);
            if (i != size - 1) {
                builder.append(",");
            }
            temp = temp.next;
        }
        builder.append("]");

        return builder.toString();
    }

    public static void main(String[] args) {
        DoubleLinkedListfrmScratch<Integer> doubleLinkedListfrmScratch = new DoubleLinkedListfrmScratch<>();
        System.out.println("Checking size initially " + doubleLinkedListfrmScratch.size());
        doubleLinkedListfrmScratch.addFirst(1);
        doubleLinkedListfrmScratch.addFirst(20);
        System.out.println("Size after adding element: " + doubleLinkedListfrmScratch.size());

        doubleLinkedListfrmScratch.addLast(30);
        doubleLinkedListfrmScratch.addLast(40);

        System.out.println("Size after adding element: " + doubleLinkedListfrmScratch.size());

        System.out.println(doubleLinkedListfrmScratch.toString());
    }

}

class Node<E> {

    E data;
    Node<E> next;
    Node<E> previous;

    Node(E data) {
        this.data = data;
    }

}
