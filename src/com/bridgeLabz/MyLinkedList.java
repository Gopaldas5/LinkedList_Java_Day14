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
    public void addFirst(INode<K> node) {
        INode<K> tempNode = node;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tempNode.setNext(head);
            head = tempNode;
        }
    }
    public void addMiddle(INode<K> node) {
        INode<K> newNode = node;
        INode<K> oldNode = node;

        if (head == null) {
            head = node;
            tail = node;
        } else {
            oldNode = head.getNext();
            head.setNext(newNode);
            newNode.setNext(oldNode);
        }
    }
    public void pop(){
        if(head==null){
            return;
        }
        head=head.getNext();
    }
    public void popLast(){
        if(head==null){
            return;
        }
        INode<K> tempNode;
        tempNode = head;
        while(tempNode.getNext() != tail){
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(null);
        tail=tempNode;
    }
    public void search(INode<K> node){
        if(head==null){
            return;
        }
        INode<K> tempNode=head;
        boolean check=false;

        while(tempNode != null){

            K data1 = tempNode.getKey();
            K data2 = node.getKey();
            if(data1.equals(data2)){
                check = true;
                return;
            }
            tempNode = tempNode.getNext();
        }
        if(check == false){
        }
    }
    public void printList() {
        System.out.println("MyNode :- " + head);
    }
}
