package CodeForces;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Check if there is input available
        if (!sc.hasNextInt()) {
            System.out.println("No input provided");
            sc.close();
            return;
        }
        
        int n = sc.nextInt();
        long p = sc.nextLong();
        long q = sc.nextLong();
        long r = sc.nextLong();
        
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            if (sc.hasNextLong()) {
                a[i] = sc.nextLong();
            } else {
                System.out.println("Invalid input at index " + i);
                sc.close();
                return;
            }
        }
        
        // Arrays to keep track of maximum values
        long[] maxP = new long[n];
        long[] maxPQ = new long[n];
        long[] maxPQR = new long[n];

        maxP[0] = p * a[0];
        maxPQ[0] = maxP[0] + q * a[0];
        maxPQR[0] = maxPQ[0] + r * a[0];

        for (int i = 1; i < n; i++) {
            maxP[i] = Math.max(maxP[i - 1], p * a[i]);
            maxPQ[i] = Math.max(maxPQ[i - 1], maxP[i] + q * a[i]);
            maxPQR[i] = Math.max(maxPQR[i - 1], maxPQ[i] + r * a[i]);
        }

        System.out.println(maxPQR[n - 1]);
        sc.close();
    }
}
