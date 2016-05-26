/**
 * Created by mona on 10/23/15.
 */
import java.util.Stack;
public class Palindrome {
    public boolean isPalindrome(String s){
        Stack<Character> charStack = new Stack<Character>();
        String alphanumericStr="";
        for (int i=0; i<s.length(); i++){
            if (Character.isLetterOrDigit(s.charAt(i))){
                alphanumericStr=alphanumericStr+String.valueOf(s.charAt(i)).toLowerCase();
            }
        }
        System.out.println("str = [" + alphanumericStr + "]");
        if (alphanumericStr.length()==0 || alphanumericStr.length()==1){
            return true;
        }

        if (alphanumericStr.length()%2 == 0){
            if (s.charAt(s.length()/2) != s.charAt((s.length()/2) -1)){
                return false;
            }
        }
        System.out.println( (alphanumericStr.length()/2)-1 );
        for (int i=0; i< (alphanumericStr.length()/2);i++){

                charStack.push(alphanumericStr.charAt(i));

        }

        for (int i=(alphanumericStr.length()/2)+1; i<alphanumericStr.length(); i++){
            if (!charStack.empty()) {
                if (Character.isLetterOrDigit(alphanumericStr.charAt(i))) {
                    if (charStack.pop() != alphanumericStr.charAt(i)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public static boolean isPalindromeNaive(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sbReverse = sb.reverse();

        if (s.equals(String.valueOf(sbReverse))){
            return true;
        }
        return false;
    }

    public static boolean isPalindromLessNaive(String s) {
        if (s.length()%2==0) {
            for (int i = 0; i<(s.length()/2); i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    return false;
                }
            }
        }
        else {

            for (int i=0; i<(s.length()/2); i++) {
                if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
                    return false;
                }

            }

        }

        return true;
    }

    public static boolean isPalindromeNicer(String s) {

        for (int i=0 , j=s.length()-1 ; i<j ; i++ , j-- ) {

            if ( s.charAt(i) != s.charAt(j) ) {
                return false;
            }
        }

        return true;
    }

    public static void main (String[] argc){
        String mimim = "a.";
        Palindrome palindrome=new Palindrome();
        boolean res= palindrome.isPalindrome(mimim);
      //  System.out.println("result is  = [" + res + "]");
       // System.out.println(isPalindromeNaive("ono"));
        System.out.println(isPalindromLessNaive("osnmmno"));
        System.out.println(isPalindromeNicer("omooomo"));
        return;
    }

}
