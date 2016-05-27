/*
public static TreeMap<Integer, Character> reverse(TreeMap<Character,Integer> tmap) {
    TreeMap<Integer,Character> reversed = new TreeMap();
    for(Map.Entry<Character,Integer> entry : tmap.entrySet())
        reversed.put(entry.getValue(), entry.getKey());
    return reversed;
}
*/

/**
 * Created by mona on 5/26/16.
 */
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class IsomorphicStrings {
    //the words "abca" and "zbxz" are isomorphic
    //aabc a(2) b(1) c(1)
    //zzbx z(2) b(1) x(1)
    //my algorithm
    //create a sorted hashmap  on value
    //check to see if two hashmap are equal based on their value set
    //assuming two isomorphic strings are of the same length

    public static boolean areIsomorphic(String s1, String s2) {
        Map<Character, Integer> freqMap1 = new HashMap<>();
        Map<Character, Integer> freqMap2 = new HashMap<>();

        for (int i=0; i<s1.length(); i++) {
            if (freqMap1.containsKey(s1.charAt(i))) {
                int freq1 = freqMap1.get(s1.charAt(i));
                freqMap1.put(s1.charAt(i), freq1 + 1);
            } else {
                freqMap1.put(s1.charAt(i), 1);
            }

        }

        for (int i=0; i<s2.length(); i++) {
            if (freqMap2.containsKey(s2.charAt(i))) {
                int freq2 = freqMap2.get(s2.charAt(i));
                freqMap2.put(s2.charAt(i), freq2 + 1);
            }
            else {
                freqMap2.put(s2.charAt(i), 1);
            }

        }

        List<Integer> freqList1 = new ArrayList<>();
        List<Integer> freqList2 = new ArrayList<>();

        for (Map.Entry entry: freqMap1.entrySet()) {
            freqList1.add((Integer) entry.getValue());
        }

        for (Map.Entry entry: freqMap2.entrySet()) {
            freqList2.add((Integer) entry.getValue());
        }

        Collections.sort(freqList1);
        Collections.sort(freqList2);

        return freqList1.equals(freqList2);

    }

    //current algorithm fails with "aba" and "baa" given as input

    public static void main(String[] args) {
        String s1="abca";
        String s2="zbxz";
        System.out.println(areIsomorphic(s1, s2));
    }
}
