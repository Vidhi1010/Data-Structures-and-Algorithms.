
public class FrequencyInSortedArray {

    public static int firstOccurrence(int[] arr, int key) {
        int start = 0, end = arr.length - 1, result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                result = mid;
                end = mid - 1; 
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    
    public static int lastOccurrence(int[] arr, int key){
        int start = 0, end = arr.length - 1, result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                result = mid;
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    
    public static int frequency(int[] arr, int key) {
        int first = firstOccurrence(arr, key);
        if (first == -1) return 0;
        int last = lastOccurrence(arr, key);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 2, 3, 4, 5, 5, 5, 5, 6};
        int key = 5;
        System.out.println("Frequency of " + key + ": " + frequency(sortedArray, key));
    }
}
