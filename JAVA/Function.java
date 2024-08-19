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
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         //printHelloWorld();
        //calculateSum(a, b);
        swap(a, b);
        
       

    }
}