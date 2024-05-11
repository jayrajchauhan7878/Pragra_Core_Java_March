package Assignment5Array;

public class SumOfElements {

    public static void main(String[] args) {

        int[] arr = {10,30,43,54,23,543,43,32};

        int sum = sum(arr);
        System.out.println("Sum of all elements-- " +sum);

    }

    public static int sum(int[] arr){

        int n = arr.length;

        int sum = 0 ;

        for (int i = 0; i < n; i++) {


            sum = sum + arr[i];


        }
        return sum;
    }
}
