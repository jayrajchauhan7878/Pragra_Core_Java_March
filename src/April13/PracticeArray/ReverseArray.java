package April13.PracticeArray;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70};

        System.out.println("Printing Original array");

        for (int i = 0; i < arr.length; i++) {

            System.out.print( arr[i] + " ");

        }

        System.out.println("Printing in reverse order");

        for( int i = arr.length - 1 ; i > 0 ; i-- ){

            System.out.print(arr[i] + " ");
        }





    }
}
