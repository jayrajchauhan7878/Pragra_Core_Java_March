package april30_exception.test;

public class NestedTryBlock {

    public static void main(String[] args) {
        try{ // Main Try block

            try{

                // Try block 2

                try{
                    // Try block 3

                    int[] arr = {1,2,3,4,5,6};
                    System.out.println(arr[19]);

                }

                catch(ArithmeticException e){
                    System.out.println(e);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }


        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
