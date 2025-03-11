public class BitonicArray {
    
    public static int findPeak(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) { 
                left = mid + 1; 
            } else { 
                right = mid;
            }
        }
        return left;
    }

    // ascending part
    public static int binarySearchAsc(int[] arr, int left, int right, int key) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    //descending part
    public static int binarySearchDesc(int[] arr, int left, int right, int key) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] > key) left = mid + 1; 
            else right = mid - 1;
        }
        return -1;
    }

  
    public static int searchInBitonicArray(int[] arr, int key) {
        int peak = findPeak(arr);

        int index = binarySearchAsc(arr, 0, peak, key);
        if (index != -1) return index;

        return binarySearchDesc(arr, peak + 1, arr.length - 1, key);
    }

    public static void main(String[] args) {
        int[] bitonicArray = {1, 3, 8, 12, 9, 5, 2};
        int key = 9;
        
        int result = searchInBitonicArray(bitonicArray, key);
        
        if (result != -1) {
            System.out.println("Element " +key + "index " + result);
        } else {
            System.out.println("Element " + key + " not found.");
        }
    }
}
