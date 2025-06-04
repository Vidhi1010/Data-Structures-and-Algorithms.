package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivotIndex = partition(arr, si, ei);
        quickSort(arr, si, pivotIndex - 1);// left
        quickSort(arr, pivotIndex + 1, ei);// right
    }

    private static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei]; // last element as pivot
        int i = si - 1; // to make place for elements smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // place pivot at correct position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i; // returns pivot index
    }


    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 7, 3, 9 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
