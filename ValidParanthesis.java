import java.util.Stack;

/**
 * Created by mona on 3/12/16.
 */
public class ValidParanthesis {
    public static boolean isValid(String s){
        if (s.length()==1 || s==null){
            return true;
        }
        else {
            char[] charArr = s.toCharArray();
            Stack<Character> s1 = new Stack<>();
            Stack<Character> s2 = new Stack<>();
            Stack<Character> s3 = new Stack<>();
            Stack<Character> s4 = new Stack<>();
            Stack<Character> s5 = new Stack<>();
            Stack<Character> s6 = new Stack<>();

            for (int i = 0; i < charArr.length; i++) {
                if (charArr[i] == '{') {
                    s1.push('{');
                } else if (charArr[i] == '}') {
                    s2.push('}');
                } else if (charArr[i] == '(') {
                    s3.push('(');
                } else if (charArr[i] == ')') {
                    s4.push(')');
                } else if (charArr[i] == '{') {
                    s5.push('{');
                } else if (charArr[i] == '}') {
                    s6.push('}');
                }

            }

            if (s1.size() == s2.size() && s3.size() == s4.size() && s5.size() == s6.size()) {
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args){
        String s="]";
        System.out.println(isValid(s));
    }
}
