package Revision;

public class LinearSearch {

    public static int linearSearch(int[] arr,int target) {
        if(arr.length == 0) {
            return -1;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static boolean search(String str, char target) {
        if(str.length() == 0) {
            return false;
        }
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {12, 47, 9, 7, 10};
        String name = "vidhi";
        char target = 'h';
        System.out.println(linearSearch(arr, 7));
        System.out.println(search(name, target));
    }
}
