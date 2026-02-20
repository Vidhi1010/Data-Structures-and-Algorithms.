public class Multiples {

    public static boolean prime(int n) {

        if (n <= 1) {
            return false;

        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void printNum(int n) {
        if (n <= 100) {
            System.out.print(n);
            printNum(n + 1);
        }
    }

    public static void digitCount(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }

    //from right to left
    public static void digitsInNumber(int n) {

        while (n != 0) {

            int rem = n % 10;
            System.out.println(rem);
            n = n / 10;

        }
    }

    //from left to right
    public static void digitsInNumberLR(int n) {
        int count = 0;
        while (n > 0) {
            n = n/10;
            count++;
        }
        int divisor = (int)Math.pow(10, count - 1);
        int digit = n / divisor;
        n = n % divisor;


    }

    //Reverse, Palindrome
    public static void reverse(int n) {
        int num = n;
        int rev = 0;
        while(num != 0) {
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        System.out.println(rev);
        if(n != rev) {
            System.out.println("Not Palindrome");
        } else {
            System.out.println("Palindrome");
        }
    }

    public static void digitSum(int n) {
        int sum = 0;
        while(n != 0) {
            int r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println(sum);
    }

    public static int recursiveFact(int n) {
        if(n <= 1) {
            return 1;
        }
        return n*recursiveFact(n - 1);
    }

    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        int next;
        //int sum = 0;
        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            //sum = sum + a;
            next = a + b;
            a = b;
            b = next;
        }
        //System.out.println(sum);
    }

    

    public static void armstrongNumber(int n) {

        if(n < 0) {
            System.out.println("Not Armstrong Number");
        } 
        if(n == 0) {
            System.out.println("Armstrong Number");
        }
        //int num = n;
        //int count = 0;
        int count = (int)Math.log10(n) + 1;

        /* while(num != 0) {
            num = num / 10;
            count++;
        } */

        System.out.println(count);

        int num2 = n;
        int result = 0;
        while(num2 != 0) {
            int rem = num2 % 10;
            result = result + (int)Math.pow(rem, count);
            num2 = num2 / 10;
        }

        System.out.println(result);
        
        if(result == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }



    public static int factorial(int n) {
        int fact = 1;
        while(n != 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }

    public static void strongNumber(int n) {
        int num = n;
        int sum = 0;
        if(n < 1) {
            System.out.println("Not Strong Number");
            return;
        } else {
            while(num != 0) {
            int rem = num % 10;
            sum = sum + factorial(rem);
            num = num / 10;
        }
        }
        System.out.println(n);
        System.out.println(sum);
        if(n == sum) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }


    public static void multiples(int n) {
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        /*
         * int n = 10;
         * for(int i = 1; i <= n; i++) {
         * if(n % i == 0) {
         * System.out.print(i + ", ");
         * }
         * }
         */
        // System.out.println(prime(16));
        // printNum(1);
        //digitCount(123456);
        //digitsInNumber(123456);
        //reverse(12321);
        //digitSum(12345);
        //factorial(4);
        //fibonacci(6);
        //armstrongNumber(1634);
        //System.out.println(recursiveFact(5));
        //strongNumber(145);
        multiples(18);


    }
}
