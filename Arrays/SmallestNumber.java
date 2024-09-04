import java.util.Scanner;
//Package Arrays;
/*
Find the smallest number in an array of integers.

*/

public class SmallestNumber {

    static int SmallestElement(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]) {

        /* int arr1[] = { 2, 5, 1, 3, 0 };
        System.out.println("The smallest element in the array is: " + SmallestElement(arr1));

        int arr2[] = { 8, 10, 5, 7, 9 };
        System.out.println("The smallest element in the array is: " + SmallestElement(arr2)); */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int smallest = SmallestElement(arr);
        System.out.println("The smallest element in the array is: " + smallest);
        sc.close();
    }

}
