
public class PrimeNumber {

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        } else {
            for(int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 7;

        System.out.println(isPrime(n));
    }
     
}