package linkedlist;

import java.util.Iterator;

public class LinkedListTest {

    public static void main(String [] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(list);


        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){ // true or false // will tell you is
            // there is any element left to traverse
            System.out.println(iterator.next()); // will give next data
        }
        System.out.println("============");
        System.out.println(list.getLast());

        list.addLast(50);

        list.add(100);

        list.removeFirst();
        System.out.println(list);
        System.out.println(list.get(4));

    }
}
