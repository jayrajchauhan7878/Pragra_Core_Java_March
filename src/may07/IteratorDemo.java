package may07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


        for (int i = 0; i < list.size(); i++) {

            System.out.println("List of Elements with For loops - "+list.get(i));

        }
        System.out.println();

        for(Integer element : list){

            System.out.println(list);

        }

        System.out.println();

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){

            Integer next = iterator.next();
            System.out.println(next);
        }

    }
}
