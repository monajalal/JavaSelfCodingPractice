import java.util.Hashtable;

/**
 * Created by mona on 3/3/16.
 */
public class FiboDynamic {
    static Hashtable<Integer, Long> ht=new Hashtable<>();
    public static long fibo(int n){
        if (!ht.containsKey(0)) {
            ht.put(0, (long) 1);
        }
        if (!ht.containsKey(1)){
            ht.put(1, (long) 1);
        }

        if (!ht.containsKey(n)){
            ht.put(n, fibo(n-1)+fibo(n-2));
            return ht.get(n);
        }
        else return ht.get(n);
    }
    public static void main(String[] args){

        System.out.println(fibo(50));
    }
}
