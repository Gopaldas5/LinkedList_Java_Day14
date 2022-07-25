package com.bridgeLabz;


public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {
    }

    public void add(INode<K> node) {
        INode<K> tempNode = node;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(tempNode);
            tail = tempNode;
        }
    }

    public void printList() {
        System.out.println("MyNode " + head);
    }
}
