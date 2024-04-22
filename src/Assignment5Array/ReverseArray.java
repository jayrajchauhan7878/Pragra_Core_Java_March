package Assignment5Array;

public class ReverseArray {

    public static void main(String[] args) {


        int[] arr = {10,30,43,54,23,543,43,32};
        int temp = 0;
        int start = 0;
        int end = arr.length-1;


        /*for (int i = arr.length-1; i > 0 ; i--) {

            System.out.println(arr[i]);*/

        for (int i = 0; i < arr.length ; i++) {

            temp = arr[end];
            arr[end] = arr[start];
            arr[start]= temp;
            start++;
            end--;

            System.out.println(arr[i]);


        }



        }
    }
