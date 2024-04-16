package April13;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {


        int[] arr = new int[7];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elemnes of array");
        for ( int i = 7 ; i > arr.length; i--){

            arr[i] = scanner.nextInt();
        }

        System.out.println("Printing the elements of array in reverse");
        for ( int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }


    }

}
