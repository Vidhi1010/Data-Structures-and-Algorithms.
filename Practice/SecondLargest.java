package Practice;

import java.io.*;
import java.util.Arrays;

public class SecondLargest {

    //Time Complexity: O(NlogN), For sorting the array | Space Complexity: O(1)

    public static int secondLargest(int[] nums, int n) {
        Arrays.sort(nums);
        int secondL = nums[n-2];
        return secondL;

    }

    public static int secondSmallest(int[] nums, int n) {
        Arrays.sort(nums);
        int secondS = nums[1];
        return secondS;
    }

    //Time Complexity: O(N), We do two linear traversals in our array | Space Complexity: O(1)


    public static int second(int[] nums, int n) {
        int small = Integer.MAX_VALUE;
	    int second_small = Integer.MAX_VALUE;
	    int large = Integer.MIN_VALUE;
	    int second_large = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            small = Math.min(small, nums[i]);
            large = Math.max(large, nums[i]);
        }

        for(int i = 0; i < n; i++) {
            if(nums[i] < second_small && nums[i] != small){
                second_small = nums[i];
            }

            if(nums[i] > second_large && nums[i] != large) {
                second_large = nums[i];
            }

        }
        System.out.println(second_large);
        return second_small;
    }

    //most optimal solution
    public static int sec(int[] nums, int n) {

	    int second_small = Integer.MAX_VALUE;
	    int small = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            
        }
        return second_small;
    }



    public static void main(String[] args) {
         int[] nums = {6, 8, 4, 9, 2, 1, 20};
         int n = nums.length;
         //System.out.println(secondLargest(nums, n));
         //System.out.println(secondSmallest(nums, n));
         //System.out.println(second(nums, n));
         System.out.println(sec(nums, n));
    }
}
