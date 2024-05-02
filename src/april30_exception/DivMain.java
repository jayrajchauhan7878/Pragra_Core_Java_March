package april30_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivMain {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Enter Value of Number 1:");
        int num1 = scanner.nextInt();*/

        /*System.out.println("Enter value of Number 2 :");
        int num2 = scanner.nextInt();*/

        int num1 = 10;
        int num2;
        num2 = 0;

        int result=0;

        try {
          result  = num1 / num2 ;
        }

        catch (ArithmeticException e){

            e.printStackTrace();

        }
        catch (NullPointerException e){

            e.printStackTrace();
        }
        catch (InputMismatchException e){

            e.printStackTrace();
        }

        catch (Exception e){

            e.printStackTrace();
        }


        System.out.println("Result :"+result);

        System.out.println("After result");
    }
}
