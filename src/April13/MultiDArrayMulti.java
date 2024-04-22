package April13;

public class MultiDArrayMulti {

    public static void main(String[] args) {


        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][] = {{2,2,2},{2,2,2},{2,2,2}};


        System.out.println("Array 1 -");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(arr1[i][j] + " ");

            }

            System.out.println();

        }
        System.out.println("Array 2 ");

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(arr2[i][j]+ " ");

            }
            System.out.println();

        }

        int[][] arr3 = new int[3][3];

        System.out.println("Multiplying of Array 1 and Array 2");

        for (int i = 0; i < arr1.length ; i++) {

            for (int j = 0; j < arr2.length; j++) {

                arr3[i][j] = 0;

                for (int k = 0; k < arr3.length; k++) {

                    arr3[i][j] += arr1[i][k] * arr2[j][k];


                }
                System.out.print(arr3[i][j] +" ");
            }
            System.out.println();
        }

        }
    }

