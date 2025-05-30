package Recursion;

public class Factorial {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    public static int sum(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void extraLongFactorials(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        for(int i = 2; i <= n; i++) {
            int carry = 0;
            for(int j = 0; j < sb.length(); j++) {
                int product = (sb.charAt(j) - '0') * i + carry;
                sb.setCharAt(j, (char)(product % 10 + '0'));
                carry = product / 10;
            }
            while(carry > 0) {
                sb.append(carry % 10);
                carry /= 10;
            }
        }
        System.out.println(sb.reverse().toString());
    }

    public static int powerSum(int X, int N) {
        if(X == 0) {
            return 1;
        }
        if(X < 0) {
            return 0;
        }
        int count = 0;
        for(int i = 1; Math.pow(i, N) <= X; i++) {
            count += powerSum(X - (int)Math.pow(i, N), N);
        }
        return count;
    }
    
    public static int sumOfNaturslNumbers(int n) {
        if(n == 0) {
            return 0;
        }
        return n + sumOfNaturslNumbers(n - 1);
    }

    public static int sumOfDigits(int n) {
        if(n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);

    }
    public static int productOFDigits(int n) {
        if(n == 1) {
            return 1;
        }
        return n % 10 * productOFDigits(10);
    }

    public static int fibonacci(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

       /*  System.out.println("Factorial of n: " + fact);
        System.out.println("Factorial of n: " + factorial(5));
        System.out.println("Sum of n: " + sum(5));
        System.out.println("Sum of digits of n: " + sumOfDigits(12345));
        System.out.println("Product of digits of n: " + productOFDigits(12345)); */
        System.out.println("Sum of n: " + sumOfNaturslNumbers(5));

        System.out.println("Fibonacci of n: " + fibonacci(10));
    }
}
