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
        System.out.println(sum(3, 5));
        System.out.println(sum(3, 5, 2));
        System.out.println(sum(3.5f, 5.5f));
    }
}