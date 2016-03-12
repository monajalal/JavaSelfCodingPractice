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
            int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0, cnt5 = 0, cnt6 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '{') {
                    cnt1++;
                } else if (s.charAt(i) == '}') {
                    cnt2++;
                } else if (s.charAt(i) == '(') {
                    cnt3++;
                } else if (s.charAt(i) == ')') {
                    cnt4++;
                } else if (s.charAt(i) == '[') {
                    cnt5++;
                } else if (s.charAt(i) == ']') {
                    cnt6++;
                }
            }
            return ((cnt1 == cnt2) && (cnt3 == cnt4) && (cnt5 == cnt6));
        }
    }
    public static void main(String[] args){
        String s="]";
        System.out.println(isValid(s));
    }
}
