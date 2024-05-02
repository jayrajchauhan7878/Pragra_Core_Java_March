package april30_exception;

public class ArrayException {
    public static void main(String[] args) {


        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 10;
        arr[2] = 10;
        arr[3] = 10;
        arr[4] = 10;

        try {
            arr[5] = 20;
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }


        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);



    }
}
