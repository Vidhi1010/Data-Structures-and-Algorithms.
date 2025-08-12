package Recursion;

public class Palindrome {
   /*  public static boolean isPalindrome(String str, int left, int right) {
        
        //base case
        if (left >= right) {
            return true;
        }

        //recursive case
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        
        return isPalindrome(str, left + 1, right - 1);
        
    } */
    public static boolean isPalindrome(String str, int left, int right) {
        if(left >= right) {
            return true;
        }
        if(str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindrome(str, left + 1, right - 1);
    }

    public static boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }


    //without two pointers
    public static boolean palindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    //check palindrome in a number
    public static boolean isPalindrome(int num) {
       return num == reverse(num, 0);
    }
    
    private static int reverse(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        int lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        return reverse(num / 10, rev);
    }

    
    public static void main(String[] args) {
        //String str = "madam";

        int num = 12321;
        
        /* if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        } */
       


        /* if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        } */

        System.out.println(isPalindrome(num));
    }
}
