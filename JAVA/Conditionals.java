import java.util.*;
public class Conditionals {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        int b =  sc.nextInt();
        int button = sc.nextInt();
        /*if(a < 18){
            System.out.println("Under 18");
        }
        else{
            System.out.println("Adult");
        }*/
        /* 
        if(a == b){
            System.out.println("Equal");
        } else if(a > b){
                System.out.println("a is Greater");
        } 
        else {
                System.out.println("b is Greater");
        }
         */
        /* switch(button){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Button");
        } */
        switch(button){
            case 1 : System.out.println("the sum is : " + a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            break;
            default : System.out.println("Invalid Button");
        }
        sc.close();
     }
}
