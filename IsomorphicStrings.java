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
import java.util.*;

public class IsomorphicStrings {
    //the words "abca" and "zbxz" are isomorphic

    public static boolean areIsomorphic(String s1, String s2) {
        Map<Character, ArrayList<Integer>> freqMap1 = new LinkedHashMap<>();
        Map<Character, ArrayList<Integer>> freqMap2 = new LinkedHashMap<>();

        for (int i=0; i<s1.length(); i++) {
            if (freqMap1.containsKey(s1.charAt(i))) {
                freqMap1.get(s1.charAt(i)).add(i);
            } else {
                freqMap1.put(s1.charAt(i), new ArrayList<>(Arrays.asList(i)));
            }

        }

        for (int i=0; i<s2.length(); i++) {
            if (freqMap2.containsKey(s2.charAt(i))) {
                freqMap2.get(s2.charAt(i)).add(i);
            } else {
                freqMap2.put(s2.charAt(i), new ArrayList<>(Arrays.asList(i)));
            }
        }

        System.out.println(freqMap1.values());
        System.out.println(freqMap2.values());
        return new ArrayList<>(freqMap1.values()).equals(new ArrayList<>(freqMap2.values()));

        //return freqMap1.values().equals(freqMap2.values()); won't work

    }

    public static void main(String[] args) {
        String s1="foo";
        String s2="app";
        System.out.println(areIsomorphic(s1, s2));
    }
}
