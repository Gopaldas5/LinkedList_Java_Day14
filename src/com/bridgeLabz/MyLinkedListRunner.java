package com.bridgeLabz;

public class MyLinkedListRunner {
    public static void main(String[] args) {
        MyLinkedList<Integer> listNode = new MyLinkedList<>();
        MyNode<Integer> node = new MyNode<>(70);
        MyNode<Integer> node2 = new MyNode<>(56);
        MyNode<Integer> node3 = new MyNode<>(30);
        listNode.add(node);
        listNode.add(node2);
        listNode.add(node3);

        listNode.printList();
    }
}
