package Sorting;
import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        
        if (left >= right) {
            return;
        }
        
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        
        while (i <= mid && j <= right) {
            temp[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
        }
        while (i <= mid){
            temp[k++] = arr[i++];
        } 
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        
        System.arraycopy(temp, 0, arr, left, temp.length);
    }


    public static void mergeSort1(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort1(arr, si, mid);
        mergeSort1(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si, j = mid + 1, k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (int l = 0; l < temp.length; l++) {
            arr[si + l] = temp[l];
        }
    }


  
    
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};

        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        mergeSort1(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
