package Class;

public class ArraySum {//(O(n))
    public static int preSum(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix[arr.length - 1];
    }
    public static int sufixSum(int[] arr) {
        int[] sufix = new int[arr.length];
        sufix[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            sufix[i] = sufix[i + 1] + arr[i];
        }
        return sufix[0];
    }


    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 7, 5 };
        System.out.println(preSum(arr));
        System.out.println(sufixSum(arr));
    }
}
