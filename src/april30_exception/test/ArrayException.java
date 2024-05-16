package april30_exception.test;

public class ArrayException {

    public static void main(String[] args) {

       try {
           int[] arr = new int[5];

           System.out.println(arr[10]);

       }
       catch (ArithmeticException e){
           System.out.println(e);
       }
       catch (NullPointerException e){
           System.out.println(e);
       }
       catch(Exception e){
           System.out.println(e);
       }

    }
}
