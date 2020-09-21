package com.datastrucutre.collection.linkedlist;

public class Node<T> {
    private final T data;
    private final Node<T> nextNode;


    public Node(T data, Node<T> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public Node(T data) {
        this(data, null);
    }

    public T getData() {
        return data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
