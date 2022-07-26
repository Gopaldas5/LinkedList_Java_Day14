package com.bridgeLabz;

public class MyLinkedListRunner {
    public static void main(String[] args) {
        MyLinkedList<Integer> listNode = new MyLinkedList<>();
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(56);
        MyNode<Integer> thirdNode = new MyNode<>(30);
        listNode.add( firstNode);
        listNode.add(secondNode);
        listNode.add(thirdNode);

        listNode.printList();
    }
}
