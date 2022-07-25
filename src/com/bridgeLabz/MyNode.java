package com.bridgeLabz;

public class MyNode<K> implements INode<K> {
    private K key;
    private INode<K> next;
    public MyNode(K key) {
        this.key = key;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;

    }

    @Override
    public INode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(INode<K> next) {
        this.next = next;
    }

    @Override
    public String toString() {
//        return "MyNode{" +
//                "key=" + key +
//                ", next=" + next +
//                '}';
        StringBuilder myNodeBuilder = new StringBuilder();
        myNodeBuilder.append("Node{" +" key = ").append(key).append(" }");
        if (next != null){
            myNodeBuilder.append(" --> ").append(next);
        }
        return myNodeBuilder.toString();
    }
}
