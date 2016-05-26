/**
 * Created by mona on 5/25/16.
 */
import java.util.Map;
import java.util.TreeMap;

public class isAnagram {

    public static boolean areAnagrams( String s1 , String s2 ) {

        if ( s1.length() != s2.length() ) {
            return false;
        }

        Map< Character , Integer> charFrequencyS1 = new TreeMap<>();
        Map< Character , Integer> charFrequencyS2 = new TreeMap<>();

        for ( int i=0 ; i<s1.length() ; i++ ) {
            if ( charFrequencyS1.containsKey(s1.charAt(i)) ) {
                int freq = charFrequencyS1.get(s1.charAt(i));
                charFrequencyS1.put(s1.charAt(i), freq+1);
            }

            else {
                charFrequencyS1.put(s1.charAt(i), 1);
            }

            if ( charFrequencyS2.containsKey(s2.charAt(i)) ) {
                int freq = charFrequencyS2.get(s2.charAt(i));
                charFrequencyS2.put(s2.charAt(i), freq+1);
            }

            else {
                charFrequencyS2.put(s2.charAt(i), 1);
            }

        }

        return charFrequencyS1.equals(charFrequencyS2);

    }

    public static void main( String args[] ) {

        String s1="mona";
        String s2="noea";

        System.out.println(areAnagrams(s1,s2));

    }
}
