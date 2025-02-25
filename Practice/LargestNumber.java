package Practice;

public class LargestNumber {
    public static int largestNumber(int[] nums) {
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++ ) {
            if(nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] nums = {6, 8, 4, 9, 2, 1, 20};
        System.out.println(largestNumber(nums));
    }
}
