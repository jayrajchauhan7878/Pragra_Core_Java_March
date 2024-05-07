package april30_exception;

public class ArrayOutBound {

    public static void main(String[] args) {


        int[] array = new int[3];

        array[0] = 10;
        array[1] = 20;
        array[2] = 20;

        try {
            array[4] = 30;
        }
        catch (ArrayIndexOutOfBoundsException e){

            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
