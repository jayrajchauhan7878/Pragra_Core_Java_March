package Assignment5Array;

public class FindAverage {


    public static void main(String[] args) {


        int[] arr = {10,30,43,54,23,543,43,32};

        float avg = avg(arr);

        System.out.println("Average of all elements is "+avg);
    }


    public static float avg(int[] arr){

        float n = arr.length;
        float sum = 0;
        float average = 0;

        for (int i = 0; i < n; i++) {

            sum = sum + arr[i] ;



        }

        return average = sum / n;
    }
}
