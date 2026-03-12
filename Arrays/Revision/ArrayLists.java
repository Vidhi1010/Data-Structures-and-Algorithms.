package Revision;
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

     /* 
        list.add(10);
        list.add(14);
        list.add(15);
        list.add(18);
        list.add(11); 
    */

        for(int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list);
    }
    
}
