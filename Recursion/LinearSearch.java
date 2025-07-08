package Recursion;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target, int index) {
        if(arr.length == index) {
            return -1; // Base case: if index reaches the length of the array, target not found
        }

        if(arr[index] == target) {
            return index; // If the current element matches the target, return the index
        }

        return linearSearch(arr, target, index + 1); // Recursive case: check the next index
        
    }

    public static boolean linearSearchBoolean(int[] arr, int target, int index) {
        if(arr.length == index) {
            return false; // Base case: if index reaches the length of the array, target not found
        }

        return arr[index] == target || linearSearchBoolean(arr, target, index + 1); // Using logical OR to combine conditions
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 13, 3, 9, 5, 7, 8, 2, 4, 6};
        int target = 8;
        System.out.println(linearSearch(arr, target, 0));
    }
    
}
