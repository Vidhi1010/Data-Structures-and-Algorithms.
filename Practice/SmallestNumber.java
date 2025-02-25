package Practice;

public class SmallestNumber {

    public static int smallestNumber(int nums[]) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if ((nums[i] < smallest)) {
                smallest = nums[i];
            } 
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] nums = {6, 8, 4, 9, 2, 1, 20};
        System.out.println(smallestNumber(nums));
    }
}
