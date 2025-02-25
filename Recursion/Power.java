package Recursion;

public class Power {
    public static int power(int base, int exponent) {
        //base case
        if (exponent == 0) {
            return 1;
        }
        //recursive case
        return base * power(base, exponent - 1);
    }
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        System.out.println(power(base, exponent));
    }
}
