public class Mirror {

    /* 
       1111111
       33333
       555
       7
       555
       33333
       1111111
       
     */
    public static void main(String[] args) {
        int rows = 4;  // The upper half rows count (including middle)
        
        // Printing the upper half (including middle row)
        for (int i = 0; i < rows; i++) {
            int num = 2 * i + 1;    // The number to print (1, 3, 5, 7)
            int count = 7 - 2 * i;  // The number of times it appears
            
            for (int j = 0; j < count; j++) {
                System.out.print(num);
            }
            System.out.println();
        }

        // Printing the lower half (mirror of upper half excluding middle row)
        for (int i = rows - 2; i >= 0; i--) {
            int num = 2 * i + 1;    // The number to print
            int count = 7 - 2 * i;  // The number of times it appears

            for (int j = 0; j < count; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
