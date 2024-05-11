package may07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0,304,50,203,503,23,30,50,203,503,22,100);

        System.out.println();

        List<Integer> list1 = new ArrayList<>();

        for(Integer element : list ){

            if(!list1.contains(element)){

                list1.add(element);
            }

            System.out.println(list1);
        }



    }
}
