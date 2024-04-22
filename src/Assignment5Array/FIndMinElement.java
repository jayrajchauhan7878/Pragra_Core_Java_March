package Assignment5Array;

import java.util.Arrays;

public class FIndMinElement {

    public static int miniElement(int[] arr){

        int min = arr[0];


        for (int i = 0; i < arr.length; i++) {

            if ( arr[i] < min){

                min = arr[i];
            }

        }
        return min;
    }

    public static void main(String[] args) {

        int[] arr = {10,30,43,54,23,543,43,32};
        int array = 0;
        for (int i = 0; i < arr.length ; i++) {




        }
        System.out.println("Array : " +
                "" +
                ""+Arrays.toString(arr));


        System.out.println("Minimum element from above array "+miniElement(arr));
    }
}
