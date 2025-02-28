package ArraysBasic;
import java.util.*;

public class ReverseArray {

    public static int[] reverse(int[] arr) {
        int n = arr.length;

        int[] reversedArr = new int[n];  

        for (int i = 0; i < n; i++) {
            reversedArr[i] = arr[n - 1 - i];
        }
        
        return reversedArr;
    }

    public static void reverseArray(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }


    public static void main(String[] args) {
        int arr[] = {3, 6, 8, 9, 2, 1};
        //reverseArray(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] reversedArr = reverse(arr);
        System.out.println(Arrays.toString(reversedArr));
    }
}
