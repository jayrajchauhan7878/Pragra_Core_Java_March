package may07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemove {

    public static void main(String[] args) {


        List list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


        Iterator<Integer> iterator = list.iterator();

        Integer next = iterator.next();

        if(next ==30){

            iterator.remove();
        }

        System.out.println(list);
    }
}
