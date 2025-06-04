
import java.util.*;

class LeaderInArray {

    // Function to find leaders in the array using brute force approach.
    // Time Complexity: O(n^2)
    // Space Complexity: O(1) for the input array, O(n) for the output array.
    // where n is the size of the input array.

    public static ArrayList<Integer> printLeadersBruteForce(int[] arr, int n) {//O(n^2) time complexity and O(n) space complexity for the output array.

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean leader = true;

            // Checking whether arr[i] is greater than all
            // the elements in its right side
            for (int j = i + 1; j < n; j++){
                if (arr[j] > arr[i]) {

                    // If any element found is greater than current leader
                    // curr element is not the leader.
                    leader = false;
                    break;
                }
            }
            // Push all the leaders in ans array.
            if (leader == true)
                ans.add(arr[i]);

        }

        return ans;

    }

    public static ArrayList<Integer> printLeadersOptimal(int[] arr, int n) {//O(n) time complexity and O(1) space complexity for the input array.
        ArrayList<Integer> ans = new ArrayList<>();

        int max = 0;

        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }

        return ans;
    }
    public static void main(String args[]) {
        // Array Initialization.
        int n = 6;
        int arr[] = { 10, 22, 12, 3, 0, 6 };

        ArrayList<Integer> ans = printLeadersBruteForce(arr, n);

        for (int i = 0; i < ans.size(); i++) {
            //System.out.print(ans.get(i) + " ");
        }


        ArrayList<Integer> ans1 = printLeadersOptimal(arr, n);

        Collections.sort(ans1, Collections.reverseOrder());

        for (int i = 0; i < ans1.size(); i++) {
            System.out.print(ans1.get(i) + " ");
        }

        
    }
}
