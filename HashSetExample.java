/**
 * Created by mona on 10/21/15.
 */
import java.util.HashSet;
public class HashSetExample {
    public static void main(String args[]) {
        // HashSet declaration
        HashSet<String> hset = new HashSet< >();

        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);
        System.out.println("hash set is = [" + hset + "]");
        //Displaying HashSet elements
        System.out.println(hset);
    }
}
