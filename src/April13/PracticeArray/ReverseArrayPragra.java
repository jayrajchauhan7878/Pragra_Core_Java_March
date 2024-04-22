package April13.PracticeArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArrayPragra {


    public static void main(String[] args) {


        int[] arr = {10,20,30,40,50};

        int start = 0;
        int end = arr.length-1;
        int temp = 0;

        for (int i = 1 ; i <= arr.length/2;i++){

            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp ;

            start++;
            end-- ;


        }

        System.out.println(Arrays.toString(arr));

    }
}
