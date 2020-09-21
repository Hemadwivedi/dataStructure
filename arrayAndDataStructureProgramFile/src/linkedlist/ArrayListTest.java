package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

       // list.remove("B");

        System.out.println(list.get(100));

        System.out.println(list);
    }

}
