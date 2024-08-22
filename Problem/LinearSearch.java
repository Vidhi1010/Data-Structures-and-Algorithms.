package Problem;

public class LinearSearch {

    public static int linearSearch(int numbers[], int key) {
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static String linearSearchString(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {  // Use .equals() to compare strings
                return Integer.toString(i);  // Convert the integer index to a String
            }
        }
        return "Not found";
    }
    
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        int key = 10;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println("key is at index: " + index);
        }


        //String 
        String[] menu = {"Burger", "Pizza", "Pasta", "Salad", "Sandwich"};
        String key1 = "Pasta";
        System.out.println(linearSearchString(menu, key1));
    }
}
