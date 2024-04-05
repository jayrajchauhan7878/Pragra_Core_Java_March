package Assignments.Assignment1;

import java.util.Scanner;

public class CheckVowel {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Character to check vowel or constant");
        char input = scanner.next().charAt(0);


        if ( input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u'){

            System.out.println(input+ " - This character is vowel");


        }else {
            System.out.println(input+ "- This is constant");
        }

        scanner.close();


    }
}
