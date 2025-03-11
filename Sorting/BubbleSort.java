package Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for(int pass = 0; pass < arr.length - 1; pass++) {
            for(int j = 0; j > arr.length - pass - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void bubbleSortOpt(int[] arr) {
        for(int pass = 0; pass < arr.length - 1; pass++) {
            int swap = 0;
            for(int j = 0; j > arr.length - pass - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap ++;
                }
            }
            // If no two elements were swapped in the inner loop, then the array is sorted
            if(swap == 0) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 11, 9, 2, 17, 4};
        bubbleSort(arr);
        printArray(arr);
    }
}
