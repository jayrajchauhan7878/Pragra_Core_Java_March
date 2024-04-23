package Assignment5Array;

public class FindSecondMax {

    public static void main(String[] args) {


        int[] arr = {10, 30, 43, 54, 23, 543, 43, 32};

        FindSecondMax findSecondMax = new FindSecondMax();
        findSecondMax.secondMax(arr);


      /*  System.out.println(arr[i]);
*/





    }

    public void secondMax(int[] arr){




        int n = arr.length;
        int temp;

        for (int i = 0; i < n; i++) {

            for (int j = i+1; j < n  ; j++) {

                if (arr[i] > arr[j]){

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr [j] = temp;



                }

            }

        }

    }

}
