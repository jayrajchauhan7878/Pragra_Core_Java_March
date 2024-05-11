package may07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        for (Integer s : set){

            System.out.println(set);
        }

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){

            Integer next = iterator.next();
            System.out.println(next);
        }

    }
}
