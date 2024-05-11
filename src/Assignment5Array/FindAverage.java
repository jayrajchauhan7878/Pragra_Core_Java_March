package Assignment5Array;

public class FindAverage {


    public static void main(String[] args) {


        int[] arr = {10,30,43,54,23,543,43,32};

        int avg = avg(arr);

        System.out.println("Average of all elements is "+avg);
    }


    public static int avg(int[] arr){

        int n = arr.length;
        int sum = 0;
        int average = 0;

        for (int i = 0; i < n; i++) {

            sum = sum + i ;
            average = sum / n;


        }

        return average;
    }
}
