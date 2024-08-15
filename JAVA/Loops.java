import java.util.*;

public class Loops {

    // WHILE LOOP
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* int counter = 0;
        while (counter < 100) {
            System.out.println("Hello World");
            counter++;
        } */

        /* int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        } */

        //1 to n
        /* 
        int counter = 1;
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while (counter <= num) {
            System.out.println(counter);
            counter++;
        } */

        //sum of first n natural numbers
        
        /* System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum = sum + i;
            //sum += i;
            i++;
        } 
        System.out.println("Sum is: " + sum); */

        //FOR LOOP
        
        /* int n = sc.nextInt();
        for(int i = 0; i <= n; i++) {
            System.out.println("Hello World");
        } */

        //Print square pattern
        /* for(int line = 1; line <= 4; line++) {
            System.out.println("****");
        }*/

        //Print reverse of a number
         
       /* int n = 10899;
          while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n = n / 10;
        }
        System.out.println(); */
        /* int n = 10899;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n/10;
        }
        System.out.println(rev); */

        //Do While Loop

        /* int counter = 1;
        do{
            System.out.println("Hello World");
            counter++;
        }while(counter <= 10); */

        //keep entering numbers till user enters a multiple of 10
       /*  do{
            System.out.println("Enter your number: ");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while(true);
        */
        //Continue 
        /* for(int i = 1; i <=5; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(i);
        } */

        //
        /* do{
            System.out.println("Enter your number: ");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                continue;
            }
            System.out.println("number was : " + n);
        } while(true); */

        //Prime Number
        int num = sc.nextInt();
        /* int i = 2;
        while (i < num) {
            if (num % i == 0) {// n is a multiple of i
                System.out.println("Not prime");
            }
            i++;
        }
        System.out.println("prime"); */
/* 
        if (num == 2) {
            System.out.println("num is prime");
        }
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("num is prime");
        }else{
            System.out.println("num is not prime");
        } */
        
    }

}