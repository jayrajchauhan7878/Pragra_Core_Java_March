package Assignment5Array;

public class FindMaxElement {

    public static int maxNumber (){

        int[] arr = {10,30,43,54,23,543,43,32};
        int max = 0;

        for (int i = 0; i < arr.length; i++) {


            if(arr[i] > max){

                max = arr[i];

        }

        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("Max number is " + maxNumber());

    }
}
