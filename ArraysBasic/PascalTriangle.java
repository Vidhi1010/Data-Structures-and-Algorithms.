package ArraysBasic;

import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
   /*  public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // First and last elements in each row are 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Compute middle elements using previous row
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }
        
        return triangle;
    } */
    public static int[][] generate(int numRows) {
        int[][] triangle = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            // Allocate memory for the row (size = i + 1)
            triangle[i] = new int[i + 1];
            
            // First and last element in each row is always 1
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            // Compute middle elements using previous row
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        return triangle;

}
}

