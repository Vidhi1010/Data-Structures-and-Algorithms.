import java.util.*;
import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {

        /*
        Arrays.sort(arr);

        System.out.println("Element Frequency:");
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " : " + count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " : " + count); */

        int[] arr = {1, 2, 2, 3, 3, 3, 4, 1, 2, 4, 4, 4};
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element Frequency:");
        for (var entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }

    
}

