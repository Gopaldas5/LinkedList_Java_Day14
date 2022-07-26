package com.bridgeLabz;

public class MyLinkedListRunner {
    public static void main(String[] args) {
        MyLinkedList<Integer> listNode = new MyLinkedList<>();
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
//        listNode.add( firstNode);
//        listNode.add(secondNode);
//        listNode.add(thirdNode);
//        listNode.printList();

        listNode.add(firstNode);
        listNode.printList();

        listNode.add(secondNode);
        listNode.printList();

        listNode.addMiddle(thirdNode);
        listNode.printList();

        System.out.println("Deleting the first element in the list");
        listNode.pop();
        listNode.printList();
    }
}
