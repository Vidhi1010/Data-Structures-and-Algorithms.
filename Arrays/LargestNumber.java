public class LargestNumber {

    public static int largestNumber(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int smallestNumber(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("largest: " + largestNumber(numbers));
        System.out.println("smallest: " + smallestNumber(numbers));

    }
}
