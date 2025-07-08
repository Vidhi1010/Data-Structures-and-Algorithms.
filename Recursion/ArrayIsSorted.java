package Recursion;

public class ArrayIsSorted {

    public static boolean isSorted(int[] arr, int index) {
        // Base case: if we reach the last element, the array is sorted
        if (index == arr.length - 1) {
            return true;
        }

        // Check if the current element is greater than the next element
        /* if (arr[index] > arr[index + 1]) {
            return false; // Not sorted
        } */

        // Recursive case: check the next element
        //return isSorted(arr, index + 1);

        return arr[index] <= arr[index + 1] && isSorted(arr, index + 1);

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};
        System.out.println(isSorted(arr, 0));
    }
}
