package Assignment4;


import java.util.Scanner;

// write a java program to that converts temperature from Celsius to Fahrenheit and Celsius to Kelvin. Use method overloading to perform that.
public class CelsiusToFahrenhit {


    public static double celsiusToFahrenhit(double celsius){

       // this.celsius = (this.celsius * 1.8) +32 ;

        return (celsius * 1.8) +32;
    }

    public static double fahrenhitToKelvin(double celsius){

       // this.celsius = celsius + 273.15;
        return (celsius + 237.15);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of Celsius :");
        double celsius = scanner.nextDouble();

        System.out.println("Celsius to Fahrenhit is "+celsiusToFahrenhit(celsius));
        System.out.println("Celsius to Fahrenhit is "+fahrenhitToKelvin(celsius));

    }
}
