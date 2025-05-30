import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void subset(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < (1 << n); i++) {
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print("[" + numbers[j] + "]");
                }
            }
            System.out.println();
        }
    }
    
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); 
        
        for (int num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(num);
                result.add(subset);
            }
        }
        return result;
        
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3};
        subset(numbers);

        List<List<Integer>> result = subsets(numbers);
        System.out.println(result);
    }
}
