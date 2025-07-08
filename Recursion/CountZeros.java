package Recursion;

public class CountZeros {

    public static int countZeros(int n) {

        int count = 0;

        if(n == 0) {
            return 1;
        }

        if(n < 10) {
            return 0;
        }

        int lastDigit = n % 10;

        if(lastDigit == 0) {
            count++;
        }

        return count + countZeros(n / 10);

    }
    public static void main(String[] args) {
        int n = 1002003000;

        int result = countZeros(n);

        System.out.println("Number of zeros in " + n + " is: " + result);
        
    }
}
