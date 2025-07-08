package BinarySearch;


public class BinarySearch {//prerequisite - sorted arrays

    public static int binarySearch(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end)/2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {//right
                start = mid + 1;
            } else {//left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 7, 10, 13, 18, 20};
        int key = 13;
        System.out.println("index for key is : " + binarySearch(sortedArray, key));
    }
}
