package Revision;
import java.util.*;

public class BasicTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        //no. of rows
        System.out.println(arr.length);

        //input
        for(int row = 0; row < arr.length; row++) {
            //for each column in a row
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        //output
        /*  for(int row = 0; row < arr.length; row++) {
            //for each column in a row
            for(int col = 0; col < arr[row].length; col++) {
                 System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        } */

        for(int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        sc.close();;

    }
}
