package Class;

public class MaxChunk {
    //769 = leethcode
    public static int maxChunk(int arr[]){
        int ans = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
            if (max == i) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 4};
        System.out.println(maxChunk(arr));

    }
}
