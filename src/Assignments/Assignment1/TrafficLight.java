package Assignments.Assignment1;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color for traffic light");
        String color = scanner.nextLine();
        
        if (color.equals("red")){

            System.out.println("Stop !!");
        }else if (color.equals("yellow")) {
            System.out.println("Prepare to Stop !!");
            
        }else if(color.equals("green")){
            System.out.println("To go !!");
        }else {
            System.out.println("Invalid Color Input");
        }


    }
}
