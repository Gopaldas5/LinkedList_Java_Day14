package com.bridgeLabz;

public class Queue<K> {
    private final MyLinkedList<K> listNode;
    public Queue(){
        listNode = new MyLinkedList<>();
    }
    public void enqueue(INode<K> node){
        listNode.add(node);
    }
    public INode<K> dequeue(){
        return listNode.popFirst();
    }
    public void printQueue(){
        listNode.printList();
    }

    public static void main(String[] args) {

        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(70);
        MyNode<Integer> thirdNode = new MyNode<>(30);

        Queue<Integer> queueTest = new Queue<>();
        queueTest.enqueue(firstNode);
        queueTest.enqueue(secondNode);
        queueTest.enqueue(thirdNode);
        queueTest.printQueue();

    }
}
