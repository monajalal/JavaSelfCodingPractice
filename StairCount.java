/**
 * Created by mona on 3/3/16.
 */
import java.util.Hashtable;
public class StairCount {
    /*
     A man is running up a staircase with n steps, and can go either 1 steps, 2 steps,
      or 3 steps at a time. count how many possible ways the child can run the stairs.
     */
    static Hashtable<Integer, Long> ht=new Hashtable<>();

    public static long stairs(int n){
        if (!ht.containsKey(1)){
            ht.put(1, (long) 1);
        }
        if (!ht.containsKey(2)){
            ht.put(2, (long) 2);
        }
        if (!ht.containsKey(3)){
            ht.put(3, (long) 4);
        }

/*
        if (!ht.containsKey(n)){
            ht.put(n, stairs(n-1)+ht.get(1)+stairs(n-2)+ht.get(2)+stairs(n-3)+ht.get(3));
        }
*/
        if (!ht.containsKey(n)){
            ht.put(n, stairs(n-1)+stairs(n-2)+stairs(n-3));
        }
        return ht.get(n);
    }
    public static void main(String[] args){
        System.out.println(stairs(4));

    }
}
