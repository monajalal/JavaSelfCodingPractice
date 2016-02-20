/**
 * Created by mona on 2/19/16.
 */
public class StringTest {
    public static void main(String args[]) {
        String str = "Mona is a good girl";
        int len = str.length();
        String reverse= str.substring(1,4);
        char ch=str.charAt(2);
        String[] strArr=str.split(" ");
        System.out.println(reverse);
        System.out.println(ch);
        for (int i=0; i<strArr.length; i++)
        System.out.println(strArr[i]);
    }

}
