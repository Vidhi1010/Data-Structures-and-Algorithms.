import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int  index = Arrays.binarySearch(arr, 3);
        System.out.println("Index of 3: " + index);
    }
}
