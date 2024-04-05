package ScannerDemo;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInputString {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter your full name");
        String name = scanner.nextLine();

        System.out.println(name);

    }
}
