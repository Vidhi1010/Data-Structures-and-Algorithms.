package Problem;
import java.util.*;

public class LargestNumber {
    public static int getLargest(int numbers[]) {

        int largest = Integer.MIN_VALUE;// -infinity
        int smallest = Integer.MAX_VALUE;// infinity

        for(int i = 0; i < numbers.length; i++) {
            //largest
            if (numbers[i] > largest) {
                largest = numbers[i];
            } 
            //smallest
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            } 
        }
        System.out.println("smallest value: " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 4, 6, 8, 3};
        System.out.println("Largest value: " + getLargest(numbers));
    }
}
