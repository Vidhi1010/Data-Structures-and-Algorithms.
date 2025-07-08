import java.util.Arrays;
public class SecondLargestNumber {

    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] != arr[n-1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 7, 5 };
        int n = arr.length ;
        int largest = arr[0];

        for(int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < n ; i++) {
            if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
    }
} 
