import java.util.*;
public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day : ");
        String day = sc.nextLine();

        switch (day) {
            case "Monday", "Tuesday" ,"Wednesday" , "Thursday" ,"Friday" -> 
                System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> 
                System.out.println("It is a weekend");
            default -> System.out.println(day + "It is not a day"); 
        }
    }
}
