package Recursion;

public class BinaryExpontial {

    public static int power(int base, int exponent) {
        //base case
        if (exponent == 0) {
            return 1;
        }
        //recursive case
        int result = power(base, exponent / 2);
        if (exponent % 2 == 0) {
            return result * result;
        } else {
            return base * result * result;
        }
    }
    public static void main(String[] args) {
        System.out.println(power(2, 8));
    }
}
