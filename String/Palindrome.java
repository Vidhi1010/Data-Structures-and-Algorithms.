public class Palindrome {


    public static boolean isPalindrome(String str) {
        
        //int left = 0, right = str.length() - 1;

        /* while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        } */

        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";

        System.out.println(isPalindrome(str));

    }
    
}
