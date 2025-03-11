package Sorting;
import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int pivotIndex = partition(arr, l, r);
            quickSort(arr, l, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, r);
        }
    }

    private static int partition(int[] arr, int l, int r) {
        int pivot = arr[r]; //last element as pivot
        int i = l - 1; //index of smaller element

        for (int j = l; j < r; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, r);
        return i + 1; //returns pivot index
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 7, 3, 9};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
