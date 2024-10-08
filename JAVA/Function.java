import java.util.Scanner;

public class Function {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        return;
    }

    public static void calculateSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }
    
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a :" + a);
        System.out.println("value of b :" + b);
    }

    public static int calProduct(int a, int b) {
        int product = a * b;
        System.out.println(product);
        return product;
    }

    public static int factorial(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;

    }
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binCoeff = fact_n/ (fact_r * fact_nmr);
        return binCoeff;

    }

    //func to cal sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    //func to cal sum of 3 numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //func to cal float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    //prime number

    /* public static boolean isPrime(int n) {
        boolean isPrime = true;
        for( int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    } */

   /*  public static boolean isPrime(int n) {
        //corner cases
        if (n == 2) {
            return true;
        }
        for( int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    } */
    
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    //print all primes in a range

    public static void primeInRange(int n) {
        for(int i = 2; i <= n; i++) {
            if (isPrime(i)) {//true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //Binary to decimal
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10 ;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }
 
    //decimal to binary
    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2 ;
            binNum = binNum + (rem * (int)Math.pow(10, pow));

            pow++;
            n = n/2;
        }
        System.out.println("binary of " + myNum + " = " + binNum);
    }

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
         //printHelloWorld();
        //calculateSum(a, b);
        //swap(a, b);
        //calProduct(a, b);
        //factorial(5);
        //System.out.println(factorial(5));
        //binCoeff(5, 2);
        // System.out.println(binCoeff(5, 2));
        /* System.out.println(sum(3, 5));
        System.out.println(sum(3, 5, 2));
        System.out.println(sum(3.5f, 5.5f)); */
        //System.out.println(isPrime(16));
        //primeInRange(20);
        //binToDec(1010);
        decToBin(7);

    }
}