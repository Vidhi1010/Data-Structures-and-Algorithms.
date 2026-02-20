import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        int even = 0;
        int odd = 0;

        
        while (true) {
            System.out.print("Enter number (or 'x' to stop): ");
            String input = sc.nextLine();

            if (input.equals(("x"))) {
                break;
            }

            int num = Integer.parseInt(input);

            sum += num;
            count++;
            
            //max
            if(num > max) {
                max = num;
            }

            //even or odd
            if(num % 2 == 0) {
                even++;
            }
            if(num % 2 != 0) {
                odd++;
            }
            
            
        }
        System.out.println("Sum:" + sum);
        System.out.println("Count:" + (count));
        System.out.println("Avg:" + sum/(count));
        System.out.println("Max:" + max);
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);
    }
}
