package Recursion;

public class FirstOccurence {
    public static int firstOccurence(int[] arr, int target, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == target) {
            return i;
        }

        return firstOccurence(arr, target, i + 1);
    }

    public static int lastOccerance(int[] arr, int target, int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOccerance(arr, target, i + 1);
        if(isFound == -1 && arr[i] == target) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 9};
        int target = 5;
        System.out.println(firstOccurence(arr, target, 0));
        System.out.println(lastOccerance(arr, target, 0));
    }
}
