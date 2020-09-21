package linkedlist;

import java.util.Iterator;

/**
 * [null]
 * add(2)
 * [ 2 | null]
 * add(5)
 * <p>
 * [10 | *] -> [8 | *] -> [7 | *] -> [5 | *] -> [2 | null]
 * <p>
 * [20 | *] -> [10 | *] -> [8 | *] -> [7 | *] -> [5 | *] -> [2 | null]
 *
 * @param <T>
 */
public class LinkedList<T> implements Iterable<T> {

    private Node<T> head;

    /**
     * insert O(1)
     */
    public void add(T t) {
        if (isEmpty()) {
            this.head = new Node<>(t, null);
        } else {
            Node<T> previousHead = this.head;
            this.head = new Node<>(t, previousHead);
        }
    }
/*
    int x = remove(10)
    x = 10
 */
    public Integer remove(T t) {
        return 10;
    }

    /**
     *
     *
     */
    public T get(int index) {
        int listIndex = 0;
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()) {
            if (listIndex == index) {
                return iterator.next();
            } else {
                listIndex++;
                iterator.next();
            }
        }
        throw new IndexOutOfBoundsException("Out of bound Exception");
    }

    /**
     * Write a program to add the element at last
     * Write a program to remove the first element
     * Write a program to get the last element from linked list
     * O(N)
     */

    public T getLast() {
        T data = null;
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()) {
            data = iterator.next();
        }
        return data;
    }

    /**
     * O(N)
     */
    public void addLast(T t) {
        Node<T> newNode = new Node<T>(t);

        Node<T> lastNode = this.head;
        while (lastNode.getNextNode() != null) {
            lastNode = lastNode.getNextNode();
        }
        lastNode.setNextNode(newNode);
    }

    /**
     * O(1)
     */
    public void removeFirst() {
        this.head = this.head.getNextNode();
    }


    public boolean isEmpty() {
        return head == null;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        final StringBuffer buffer = new StringBuffer("[");
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()) {
            buffer.append(iterator.next()).append(", ");
        }
        buffer.append("]");
        return buffer.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {

        private Node<T> node;

        public LinkedListIterator() {
            this.node = head;
        }

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public T next() {
            T t = node.getData();
            this.node = node.getNextNode();
            return t;
        }
    }

}
