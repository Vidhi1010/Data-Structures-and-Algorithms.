import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        /*
         * int num1 = 3;
         * int num2 = 4;
         * int sum = num1 + num2;
         * System.out.println(sum);
         * System.out.println("Hello World");
         */

        // Data types
        // primitive - predefind- integer, float, character, boolean

        int i = 10;
        byte by = 127;
        short sh = 558;
        long l = 5885l;
        double d = 5.6;
        float f = 5.6f;
        char c = 'v';
        boolean bo = true;

        // Non-primitive - String, Array, Class, Objects, Interface

        // Sum of a and b

        Scanner sc = new Scanner(System.in);

        /*
         * int a = sc.nextInt();
         * int b = sc.nextInt();
         * int sum = a + b;
         * System.out.println(sum);
         */

        /*
         * String name = sc.nextLine();
         * System.out.println(name);
         */

        /*
         * float price = sc.nextFloat();
         * System.out.println(price);
         */

        /*
         * double amount = sc.nextDouble();
         * System.out.println(amount);
         */
        // System.out.printf("%.0f%n", amount);

        // area of a circle

        /*
         * float r = sc.nextFloat();
         * float area = (3.14f * r * r);
         * System.out.println(area);
         */

        // TYPE PROMOTION
        /*
         * char a = 'a';
         * char b = 'b';
         * System.out.println((int)(a));
         * System.out.println((int)(b));
         * System.out.println(b - a);
         */

        // switch case
        /*
         * System.out.println("Enter a:");
         * int a = sc.nextInt();
         * System.out.println("Enter b:");
         * int b = sc.nextInt();
         * System.out.println("Enter operator:");
         * char operator = sc.next().charAt(0);
         * 
         * switch (operator) {
         * case '+':
         * System.out.println(a + b);
         * break;
         * case '-':
         * System.out.println(a - b);
         * break;
         * case '*':
         * System.out.println(a * b);
         * break;
         * case '/':
         * System.out.println(a / b);
         * break;
         * case '%':
         * System.out.println(a % b);
         * break;
         * 
         * default:
         * System.out.println("wrong operator");
         * break;
         * }
         */

        /*
         * System.out.println("Enter a:");
         * int a = sc.nextInt();
         * 
         * if (a > 0) {
         * System.out.println(a + " is a positive number");
         * }else {
         * System.out.println(a + " is a negative number");
         * }
         */

        /*
         * System.out.println("Enter temp:");
         * int temp = sc.nextInt();
         * 
         * if (temp > 100) {
         * System.out.println("You have fever");
         * }else {
         * System.out.println("You don't have fever");
         * }
         */

        /* System.out.println("Enter num:");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("wrong day");
                break;
        } */

        /* System.out.println("Enter year:");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is a normal year");
        } */
        
    }
}
