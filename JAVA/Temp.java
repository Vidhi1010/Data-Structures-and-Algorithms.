
import java.util.*;

public class Temp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temp: ");
        temp = sc.nextDouble();

        System.out.println("Convert to C Or F? : ");
        unit = sc.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;
        
        //System.out.printf("%.1f°%s", newTemp, unit);
        System.out.println(newTemp + "°" + unit);
        sc.close();
    }
}