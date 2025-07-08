package Recursion;

public class ReverseNumber {

    static int reverse(int num, int rev) {
        // Base condition
        if (num == 0)
            return rev;

        // Extract last digit and update rev
        int lastDigit = num % 10;
        rev = rev * 10 + lastDigit;

        // Recursive call with reduced number
        return reverse(num / 10, rev);
    }

    public static void main(String[] args) {
        int number = 1234;

        int reversed = reverse(number, 0);
        System.out.println("Reversed Number: " + reversed);
    }
}
