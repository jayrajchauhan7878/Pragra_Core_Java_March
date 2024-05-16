package may04_generics.practice;

import java.sql.SQLOutput;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<Integer> vec = new Vector<>();

        System.out.println("Size at begninng "+vec.size());

        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(40);
        vec.add(50);

        System.out.println(vec);
        System.out.println("Size after adding"+vec.size());

        vec.remove(1);

        System.out.println("After removing "+vec);
        System.out.println("Size after removing"+vec.size());
    }
}
