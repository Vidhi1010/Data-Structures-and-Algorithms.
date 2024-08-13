import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        /* int num1 = 3;
        int num2 = 4;
        int sum = num1 + num2;
        System.out.println(sum);
        System.out.println("Hello World"); */
    


    //Data types
    //primitive - predefind- integer, float, character, boolean
    
    int i = 10;
    byte by = 127;
    short sh = 558;
    long l = 5885l;
    double d = 5.6;
    float f = 5.6f;
    char  c = 'v';
    boolean bo = true;

    //Non-primitive   - String, Array, Class, Objects, Interface

    //Sum of a and b

    Scanner sc = new Scanner(System.in);

    /* int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println(sum);*/

    /* String name = sc.nextLine();
    System.out.println(name);*/

    /* float price = sc.nextFloat();
    System.out.println(price); */

    /* double amount = sc.nextDouble();
    System.out.println(amount); */
    //System.out.printf("%.0f%n", amount);


    //area of a circle 

   /*  float r = sc.nextFloat();
    float area = (3.14f * r * r);
    System.out.println(area); */

    //TYPE PROMOTION
    char a = 'a';
    char b = 'b';
    System.out.println((int)(a));
    System.out.println((int)(b));
    System.out.println(b - a);



    }
}
