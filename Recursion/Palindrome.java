package Recursion;

public class Palindrome {
    public static boolean isPalindrome(String str, int left, int right) {
        //base case
        if (left >= right) {
            return true;
        }
        //recursive case
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        
        return isPalindrome(str, left + 1, right - 1);
    }

    public static boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }

    //without two pointer

    public static boolean palindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        String str = "madam";
        
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
       


        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
