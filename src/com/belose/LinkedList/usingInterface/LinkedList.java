package com.belose.LinkedList.usingInterface;

public class LinkedList <T extends Comparable<T>> implements List<T> {

    private Node<T> headNode;
    private int noOfItems;

    @Override
    public void insert(T data) {
        Node newNode = new Node(data);
        if(headNode == null){
            this.headNode  = newNode;
        } else {
            newNode.setNextNode(this.headNode);
            this.headNode = newNode;
        }
        this.noOfItems+=1;
    }

    @Override
    public void remove(T data) {
       if(this.headNode != null && this.headNode.getData().compareTo(data) == 0) {
           this.headNode = this.headNode.getNextNode();
           this.noOfItems-=1;
           return;
       } else {
           Node previousNode = this.headNode;
           Node actualNode = this.headNode.getNextNode();
           while (actualNode != null) {
               if(actualNode.getData().compareTo(data) == 0) {
                   //decrement size
                   this.noOfItems-=1;
                   previousNode.setNextNode(actualNode.getNextNode());
                   actualNode = null;
                   return;
               }
               previousNode = actualNode;
               actualNode = actualNode.getNextNode();
           }
       }
    }

    @Override
    public void traverse() {
        if(this.headNode == null) return;
        Node currentNode = this.headNode;
        while (currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.noOfItems;
    }
}
