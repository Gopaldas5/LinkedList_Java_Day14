package com.bridgeLabz;


public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;
    public INode<K> size;

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
    public INode<K> popFirst(){
        if(head==null){
            return null;
        }
        INode<K> removedNode = head;
        head=head.getNext();
        return  removedNode;
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
    public void addAtAnyPosition(INode<K> tempNode,INode<K> node){
        INode<K> tempNode1;
        INode<K> iteratorNode = head;
        while (iteratorNode != null) {
            K data1 = tempNode.getKey();
            K data2 = iteratorNode.getKey();
            if (data1.equals(data2)) {
                node.setNext(iteratorNode.getNext());
                iteratorNode.setNext(node);
                return;
            }
            iteratorNode = iteratorNode.getNext();
        }
    }
    public void printList() {
        System.out.println("MyNode :- " + head);
    }
}
