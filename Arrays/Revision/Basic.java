package Revision;
import java.util.*;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        /* for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        } */

        for (int nums : arr) {
            System.out.println(nums);//here nums presents elements of an array
        }

        //System.out.println(Arrays.toString(arr));// for printing array with brackets, comma and all
        

    }
}
