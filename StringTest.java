/**
 * Created by mona on 2/19/16.
 */

import java.util.*;
import java.util.concurrent.SynchronousQueue;


public class StringTest {

    public static String findNonRepeatingVersionTwo(String s) throws IllegalArgumentException{
        if (s.length()>0 && s.length()<256) {
            LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (charCount.containsKey(s.charAt(i))) {
                    charCount.put(s.charAt(i), charCount.get(s.charAt(i)) + 1);
                } else
                    charCount.put(s.charAt(i), 1);
            }

            for (Character ch : charCount.keySet()) {
                if (charCount.get(ch) == 1) {
                    return String.valueOf(ch);
                }
            }

            return null;
        }
        else throw new IllegalArgumentException("String length should be between 0 and 256 characters");
    }


    public static char findRepeating(String s){

        LinkedHashMap<Character, Integer> charCount= new LinkedHashMap<>();

        int count=0;
        for (int i=0; i<s.length(); i++){
            if (charCount.containsKey(s.charAt(i))){
                count=charCount.get(s.charAt(i));
                charCount.put(s.charAt(i), ++count);
            }
            else{
                charCount.put(s.charAt(i), 1);
            }

        }
        for (Character ch:charCount.keySet()){
            if (charCount.get(ch)==1){
                return ch;
            }
        }
        return '\0';
    }

    public static String removeChar(String s, char ch){
        StringBuilder sb= new StringBuilder();
        char[] charArray= s.toCharArray();
        for (int i=0; i<charArray.length; i++){
            if (charArray[i]!=ch) {
                sb.append(charArray[i]);
            }
        }

        return sb.toString();
    }

    public static String removeAllChars(String src, String dst){
        HashSet<Character> chars = new HashSet<>();
        char[] dstCharArray=dst.toCharArray();
        for (int i=0; i<dstCharArray.length; i++){
            chars.add(dstCharArray[i]);
        }
        StringBuilder sb = new StringBuilder();
        char[] srcCharArray = src.toCharArray();
        for (int i=0; i<srcCharArray.length; i++){
            if (!chars.contains(srcCharArray[i])){
                sb.append(srcCharArray[i]);
            }
        }
        return sb.toString();

    }

    public static String sortString(String s){

        String[] strArray= s.split("\\s+");
        Arrays.sort(strArray);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<strArray.length; i++){
            sb.append(strArray[i]);
            sb.append(" ");
        }

        return sb.toString();
    }




    public static boolean permutation(String src, String dst){
        return sortString(src).equals(sortString(dst));
    }

    public static String reverseWords(String s){
        String[] strArray=s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        List<String> strList= Arrays.asList(strArray);
        Collections.reverse(strList);
        strArray= (String[])strList.toArray();
        for (int i=0; i<strArray.length; i++){
            sb.append(strArray[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static String URLify(String s, int trueLength){
        return(s.replaceAll("\\s+","%20"));
    }

    public static int convertToInt(String s){

        return Integer.parseInt(s);

    }

    public static String intToStr(int num){

        return String.valueOf(num);
    }


    public static boolean isValid(String s){

        HashMap<Character, Character> specialChar= new HashMap<>();
        specialChar.put('{', '}');
        specialChar.put('[',']');
        specialChar.put('(',')');
        Stack<Character> stk = new Stack<>();
        for (int i=0; i<s.length(); i++){

            if (specialChar.keySet().contains(s.charAt(i))){
                stk.push(s.charAt(i));
            }
            else if (specialChar.values().contains(s.charAt(i))){
                if (!stk.empty() && stk.peek()==s.charAt(i)) {
                    stk.pop();
                }
                else return false;
            }

        }

        return stk.isEmpty();

    }

    public static void main(String args[]) {

        String str = "Mona is! @very  a good girl";
        int len = str.length();
        String reverse= str.substring(1,4);
        char ch=str.charAt(2);
        String[] strArr=str.toLowerCase().split("[^\\w@]+");
        System.out.println(reverse);
        System.out.println(ch);
        for (int i=0; i<strArr.length; i++)
            System.out.println(strArr[i]);
        String s="";
        for (int i=0; i<10; i++){
            /* not good for single threaded code
            StringBuffer sb = new StringBuffer();
            */
            StringBuilder sb= new StringBuilder();
            sb.append(s);
            sb.append(i);
            sb.append(" ");
            s=sb.toString();


        }

        System.out.println(s);
        System.out.println(findRepeating("hikkss"));
        System.out.println("htlllmk kl".replaceAll("l", ""));
        System.out.println(removeChar("Mona", 'o'));
        System.out.println(reverseWords("Mona  is a happy      girl"));
        System.out.println(removeAllChars("Monanaaasdf","on"));
        System.out.println(sortString("Mona Is A good girl!"));
        System.out.println(permutation("Mona is", "is Mona"));
        System.out.println(URLify("mona mona    mona ", 23));


        System.out.println("rats live on no evil star");
        System.out.println(isValid("[{]}"));

        System.out.println(findNonRepeatingVersionTwo("mona"));
        System.out.println(findNonRepeatingVersionTwo("mmmmooooooona"));
        System.out.println(findNonRepeatingVersionTwo(" "));



    }

}
