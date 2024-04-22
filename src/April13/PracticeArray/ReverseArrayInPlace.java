package April13.PracticeArray;

import java.util.Arrays;

public class ReverseArrayInPlace {


    public static void main(String[] args) {


        int[] arr = {10,20,30,40,50};
        System.out.println("Original Array "+ Arrays.toString(arr));

        for (int i = 0; i < arr.length/2; i++) {

            int j = arr[i];
            arr [i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = j;
        }

        System.out.println("Reverse array "+ Arrays.toString(arr));
    }
}
