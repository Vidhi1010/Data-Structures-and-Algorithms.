public class LinearSearch {

    public static int linearSearch(int[] marks, int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }
        return -1; // Key not found in the array.
    }

    public static int linearSearchString(String[] menu, String key1) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key1)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int key = 10;
        int[] marks = { 2, 4, 6, 8, 10, 12, 14, 16 };

        String key1 = "samosa";
        String[] menu = {"dosa", "chole bhature", "samosa"};

        //System.out.println(linearSearch(marks, key));

        int result = linearSearchString(menu, key1);
        if (result == -1) {
            System.out.println("String \"" + key1 + "\" not found.");
        } else {
            System.out.println("String \"" + key1 + "\" found at index: " + result);
        }

        System.out.println();

    }
}
