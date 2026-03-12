package Revision;
import java.util.*;

public class ReverseArray {

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (end > start) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] rev = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
            
        }
        System.out.println(Arrays.toString(rev));

    }
}
