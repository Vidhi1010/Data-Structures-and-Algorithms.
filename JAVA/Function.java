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
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         //printHelloWorld();
        //calculateSum(a, b);
        //swap(a, b);
        //calProduct(a, b);
        //factorial(5);
        //System.out.println(factorial(5));
    }
}