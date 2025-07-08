package Sorting;

public class SelectionSort {

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minPosition]) {
                    minPosition = j;
                }
            } 

            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 11, 9, 2, 17, 4 };
        SelectionSort(arr);
        printArray(arr);
    }
}
