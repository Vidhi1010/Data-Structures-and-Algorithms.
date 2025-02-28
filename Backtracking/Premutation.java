package Backtracking;

public class Premutation {
    public void premutation(int[] arr, int index) {
        if (index == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Premutation p = new Premutation();
        p.premutation(arr, 0);
    }
}
