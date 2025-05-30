package SlidingWIndow;

public class MinSubarrySum {

    public static void minSubarraySum(int[] numbers) {
        
        int minSum = Integer.MAX_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }
                System.out.println("current sum: " + currSum);
                if (minSum > currSum) {
                    minSum = currSum;
                }
            }
        }
        System.out.println("min sum = " + minSum);
    }
    public static void main(String[] args) {
        int[] numbers = {1, -2, 6, -1, 3};
        minSubarraySum(numbers);
    }
}
