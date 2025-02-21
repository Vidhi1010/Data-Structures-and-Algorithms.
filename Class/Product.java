package Class;

public class Product {
    public static void maxProduct(int[] numbers) {
        int currProduct = 0;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currProduct = 1;
                for (int k = start; k <= end; k++) {// print
                    currProduct *= numbers[k];
                }
                System.out.println(currProduct);
                if (maxProduct < currProduct) {
                    maxProduct = currProduct;
                }
            }
        }
        System.out.println("max product = " + maxProduct);
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 7, 6, -10, 11};

        maxProduct(numbers);

    }
}
