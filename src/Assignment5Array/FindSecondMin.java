package Assignment5Array;

public class FindSecondMin {

    public static void main(String[] args) {

        int[] arr = {10, 12, 68, 64, 23, 543, 52, 32};

        System.out.println("Second Min Element in array - " + secondMin(arr));


    }

    public static int secondMin(int[] arr) {


        int n = arr.length;
        int min = arr[0];


        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;


                }


            }



        }
        return arr[1];
    }
}
