package may04_generics.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();

        list2.add(60);
        list2.add(70);
        list2.add(80);
        list2.add(90);
        list2.add(100);

        System.out.println(list2);


        list1.addAll(list2);

        System.out.println(list1);

        boolean contains = list1.contains(40);
        System.out.println(contains);

        boolean equals = list1.equals(list2);
        System.out.println(equals);

        int i = list1.lastIndexOf(90);
        System.out.println(i);

        int size = list1.size();
        System.out.println("List 1 Array size"+size);


    }
}
