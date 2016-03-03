import java.util.HashMap;
import java.util.Map;

/**
 * Created by mona on 3/2/16.
 */
public class HashMapTest {
    static HashMap<String, Boolean> map=new HashMap<>();
    public static void main(String[] args) {
        map.put("Mona", true);
        map.put("Mina", false);
        map.put("Hassan", true);
        map.put("Amir", false);
        System.out.println(map.get("Mina"));
        if (map.containsKey("Jack")) {
            System.out.println("Jack is here");
        }
        if (map.containsValue(false)) {
            System.out.println("hashmap has false values");
        }

        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
/*      how to get the entries from map
        for (Boolean b : map.values()){
            System.out.println(map.get(b));
        }




*/
//        for (Map.Entry kv : map.entrySet()) {
 //           map.remove("Mona");
  //      }

    }
}
