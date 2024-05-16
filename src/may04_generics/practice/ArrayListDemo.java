package may04_generics.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {


    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("Jay");
        name.add("John");
        name.add("Jack");

        System.out.println("Names of student - "+name);

        ArrayList<Integer> id = new ArrayList<>(Arrays.asList(10,20,30));
        System.out.println(id);
    }


    ArrayList<Integer> id = new ArrayList<>(Arrays.asList(10,20,30));


}
