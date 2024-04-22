package April13.String;

public class ReverseString {


    public static void main(String[] args) {


        String str = "Pragra";

        int temp ;

        char[] strarray = str.toCharArray();

        for (int i = strarray.length -  1 ; i >= 0  ; i--) {

            System.out.println(strarray[i]);


        }
    }


}
