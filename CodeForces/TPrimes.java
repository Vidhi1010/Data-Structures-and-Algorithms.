package CodeForces;

import java.util.*;
import java.io.*;

public class TPrimes {
    static final int MAX_N = 1000000; //because sqrt(10^12) ≈ 10^6
    static boolean[] isPrime = new boolean[MAX_N + 1];
    static Set<Long> tPrimes = new HashSet<>();


    static void sieve() {//compute primes
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= MAX_N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX_N; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        //squares of primes will be store here
        for (int i = 2; i <= MAX_N; i++) {
            if (isPrime[i]) {
                tPrimes.add((long) i * i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        sieve();

        int n = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            long x = Long.parseLong(inputs[i]);
            sb.append(tPrimes.contains(x) ? "YES\n" : "NO\n");
        }

        System.out.print(sb);
    }
}
