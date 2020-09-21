package com.datastrucutre.collection.linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(10);
        list.insert(30);
        list.insert(40);

        list.traverse();
    }
}
