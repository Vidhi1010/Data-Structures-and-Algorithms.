package Problem;
import java.util.*;

public class primeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        /* int i = 2;
        while (i < num) {
            if (num % i == 0) {// n is a multiple of i
                System.out.println("Not prime");
            }
            i++;
        }
        System.out.println("prime"); */

        if (num == 2) {
            System.out.println("num is prime");
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("num is prime");
        } else {
            System.out.println("num is not prime");
        }
    }
}
