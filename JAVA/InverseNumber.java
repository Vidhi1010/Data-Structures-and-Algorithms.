package JAVA;
import java.util.Scanner;
public class InverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        double inverse = 1.0/n;
        System.out.println(inverse);
        sc.close();

    }
}
