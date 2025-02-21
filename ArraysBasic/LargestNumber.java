package ArraysBasic;
import java.util.*;

public class LargestNumber {

    public static int largestNumber(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if ((nums[i]> largest)) {
                largest = nums[i];
            } 
        }
        return largest;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 6, 3, 5};
        System.out.println(largestNumber(nums));
    }
}
