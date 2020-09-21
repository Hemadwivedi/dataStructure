package com.datastrucutre.collection.linkedlist;

public class LinkedList<T> implements List<T> {

    private Node<T> head;

    @Override
    public void insert(T t) {
        if (head == null) {
            this.head = new Node<T>(t);
        } else {
            this.head = new Node<T>(t, head);
        }
    }

    @Override
    public void remove(T t) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void traverse() {
        Node node = head;
        while (node != null) {
            System.out.print(node.getData() + ", ");
            node = node.getNextNode();
        }
    }
}
