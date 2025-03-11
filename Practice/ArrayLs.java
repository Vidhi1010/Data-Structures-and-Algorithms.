package Practice;

import java.util.*;

public class ArrayLs {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pear");

        fruits.set(1, "Mango"); // Replace "Mango" with "Orange"
        //System.out.println(fruits);

        //System.out.println(fruits.get(1));

        fruits.remove(1); // Removes "Orange" (index 1)
        fruits.remove("Banana"); // Removes "Banana" directly
        System.out.println(fruits); // Output: [Apple]

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        
    }
}
