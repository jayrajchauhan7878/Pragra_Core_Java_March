package may04_generics.practice;

import java.util.ArrayList;

public class StringArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> greeting = new ArrayList<>();

        System.out.println("Display size at begining - "+greeting.size());

        greeting.add("Hello");
        greeting.add("Namaste");
        greeting.add("Holla");
        greeting.add("Gracis");

        System.out.println(greeting);

        System.out.println("Size after addition-"+greeting.size());

        greeting.remove(2);

        System.out.println(greeting);
    }
}
