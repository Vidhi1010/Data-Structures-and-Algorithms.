public class Triangle {

    public static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangle1(int n) {
        for (int i = 1; i < 2*n; i++) {
            for(int j = 1; j <= i; j++) {
                if(i > n) {
                    j = i - n + 1;
                    System.out.print("*");
                } else {
                    System.out.print("*");
            }
            
        }

            
        }
    }
    public static void main(String[] args) {
        int n = 5;
        triangle(n);
        System.out.println();
        triangle1(n);
    }
}
