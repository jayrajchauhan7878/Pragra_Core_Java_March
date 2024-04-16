package April13;

public class FindMax {


    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
         int max = findMax(array);

        System.out.println("Maximum value of the array is "+ max);
    }

    public static int findMax(int[] arr){



        int max = arr[0];
        for ( int i =1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }


        }

        return max;

    }


}
