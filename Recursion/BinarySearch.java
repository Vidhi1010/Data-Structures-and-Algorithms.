package Recursion;

public class BinarySearch {// no of calls: O(log n), space complexity: O(n) for recursion stack

    public static int bs(int[] nums, int target, int s, int e) {
        if(s > e) {
            return -1;
        }  

        int m = s + (e - s) / 2;
 
        if(nums[m] == target) {
            return m;
        } else if(nums[m] < target) {
            return bs(nums, target, m + 1, e);
        } else {
            return bs(nums, target, s, m - 1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = bs(nums, target, 0, nums.length - 1);
        System.out.println(result);
    }
}
