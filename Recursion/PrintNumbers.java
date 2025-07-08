package Recursion;


public class PrintNumbers {

    public static void printNumbers(int n) {
        if(n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    //even numbers from 1 to n
    public static void printEven(int n) {
        if(n == 0) {
            return;
        }
        printEven(n - 1);

        if(n % 2 == 0) {
            System.out.print(n + " ");
        }
        
    }

    //odd numbers from 1 to n
    public static void printOdd(int n) {
        if(n == 0) {
            return;
        }

        printOdd(n - 1);

        if(n % 2 != 0) {
            System.out.print(n + " ");
        }
    }


    //sum of numbers from 1 to n

    public static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
    
    public static int printSum(int n) {
        if(n == 0) {
            return 0;
        }

        int prevSum = printSum(n - 1);
        int currentSum = prevSum + n;
        System.out.print(currentSum + " ");
        return currentSum;
    }

    public static void print(int n) {
        if(n == 0) {
            return;
        }

        if(n % 2 == 0) {
            System.out.print(n + " ");
        }
        print(n - 1);
    }
    public static void main(String[] args) {
        int n = 10;
        printNumbers(n);
        System.out.println();
        printEven(n);
        System.out.println();
        printOdd(n);
        System.out.println();
        System.out.println(sum(n));
        printSum(n);
        System.out.println();
        print(n);
        System.out.println();
    }
}
