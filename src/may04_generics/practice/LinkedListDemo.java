package may04_generics.practice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> prolang = new LinkedList<>();

        System.out.println("Size at the beginning "+prolang.size());

        prolang.add("Java");
        prolang.add("C++");
        prolang.add("Node.js");
        prolang.add("Javascript");
        prolang.add("Kotlin");
        prolang.add("Go");

        System.out.println("Original Programming languages"+prolang);

        prolang.add(2,"Python");

        System.out.println("After updating python "+prolang);

        prolang.remove(4);
        prolang.remove("C++");

        System.out.println("After removing Kotlin and C++"+prolang);

        System.out.println(prolang.size());


    }
}
