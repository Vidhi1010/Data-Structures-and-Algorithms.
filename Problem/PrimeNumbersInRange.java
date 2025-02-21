package Problem;

import java.util.*;

public class PrimeNumbersInRange {

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        
        for (int i = 5; i * i <= num; i += 6) { 
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void findPrimesInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    
    //method 2

    public static void sieve(int start, int end) {
        if (end < 2) {
            System.out.println("No prime numbers in this range.");
            return;
        }

        boolean[] isPrime = new boolean[end + 1]; 
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= end; i++) {
            if (isPrime[i]) { 
                for (int j = i * i; j <= end; j += i) { 
                    isPrime[j] = false;
                }
            }
        }

        for (int i = Math.max(start, 2); i <= end; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers in the range:");
        sieve(start, end);
        
        sc.close();
    }
}

