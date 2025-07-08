package Recursion;

public class SumOfDigits {

    static int sumOfDigits(int n) {
        if(n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    static int productOfDigits(int n) {
        if(n == 0) {
            return 1; // Return 1 because multiplying by 0 would give 0
        }
        return (n % 10) * productOfDigits(n / 10);
    }
    public static void main(String[] args) {
        int number = 12345;
        int sum = sumOfDigits(number);
        System.out.println("The sum of the digits of " + number + " is: " + sum);

        int product = productOfDigits(number);
        System.out.println("The product of the digits of " + number + " is: " + product);
    }
}
