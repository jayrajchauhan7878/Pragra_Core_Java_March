package Assignment5Array;

public class FindSecondMax {

    public static void main(String[] args) {


        int[] arr = {10, 30, 68, 64, 23, 543, 43, 32};

        System.out.println("Second Largest element is "+secondMax(arr));


      /*  System.out.println(arr[i]);
*/





    }

    public static int secondMax(int[] arr){




        int n = arr.length;
        int max = arr[0];


        for (int i = 0; i < n; i++) {

            for (int j = i+1; j < n  ; j++) {

                if (arr[i] > arr[j]){

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr [j] = temp;



                }

            }

        }
        return arr[n-2];

    }

}
