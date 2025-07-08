package BinarySearch;

public class CeilingProblem {
    public static int ceiling(int[] numbers, int key) {
        int start = 0, end = numbers.length - 1;
        // int result = -1; // Default if no ceiling found

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid; // Exact match
            } else if (numbers[mid] < key) {
                start = mid + 1; // Number is smaller than key → it cannot be a ceiling → move right, do not
                                 // store mid
            } else {
                // result = mid; // Potential ceiling found
                end = mid - 1; // Move left to find a smaller ceiling
            }
        }

        /*
         * If key is greater than all elements in the array (say key = 20), then:
          
         * start will go out of bounds (i.e., start = numbers.length)
          
         * So your return start; will return an invalid index
         */
        if (start == numbers.length)
            return -1; // No ceiling found
        return start;
        // return result; // Return the smallest ceiling found
    }

    public static int[] getFloorAndCeil(int[] nums, int x) {
    int start = 0;
    int end = nums.length - 1;
    int floor = -1;
    int ceil = -1;

    while (start <= end) {
        int mid = (start + end) / 2;

        if (nums[mid] == x) {
            // Exact match: both floor and ceil are the number itself
            floor = nums[mid];
            ceil = nums[mid];
            break;
        } else if (nums[mid] < x) {
            // nums[mid] is a candidate for floor
            floor = nums[mid];
            start = mid + 1;
        } else {
            // nums[mid] is a candidate for ceil
            ceil = nums[mid];
            end = mid - 1;
        }
    }

    return new int[]{floor, ceil};
}

        
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 8, 9, 10, 12, 19 };
        int key = 11;
        System.out.println(ceiling(numbers, key));
        

        
        /* // Create an object of the class
        CeilingProblem obj = new CeilingProblem();

        // Call the method
        int[] result = obj.getFloorAndCeil(numbers, key);

        // Print the results
        System.out.println("Floor: " + result[0]);
        System.out.println("Ceil: " + result[1]); */


        int[] result = getFloorAndCeil(numbers, key);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }
}
