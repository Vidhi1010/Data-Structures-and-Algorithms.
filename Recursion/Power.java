package Recursion;

// O(n) time complexity and O(n) space complexity
public class Power {
    public static int power(int base, int exponent) {
        //base case
        if (exponent == 0) {
            return 1;
        }
        //recursive case
        return base * power(base, exponent - 1);
    }

    //optimized version O(log n)

    public static int powerOptimized(int base, int exponent) {
        //base case
        if (exponent == 0) {
            return 1;
        }
        //recursive case
        int halfPower = powerOptimized(base, exponent / 2);
        if(exponent % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return base * halfPower * halfPower;
        }
    }
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        System.out.println(power(base, exponent));
        System.out.println(powerOptimized(base, exponent));
    }
}
