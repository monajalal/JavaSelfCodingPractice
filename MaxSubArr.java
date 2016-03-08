/**
 * Created by mona on 3/7/16.
 */
import java.util.List;
import java.util.ArrayList;

   public class MaxSubArr {

        // DO NOT MODFIY THE LIST.
        public static int maxSubArray(final List<Integer> a) {
            /*
            int sum=0;
            forloop: for (int i=0; i<a.size(); i++){
                if (a.get(i)+sum>sum){
                    sum+=a.get(i);
                }
                else {
                    break forloop;
                }

            }
            return sum;
            */

       int max_so_far = a.get(0);
       int curr_max = a.get(0);
        for (int i = 1; i < a.size(); i++)
       {
           curr_max = Math.max(a.get(i), curr_max+a.get(i));
           max_so_far = Math.max(max_so_far, curr_max);
       }
       return max_so_far;

        }

    public static void main(String args[]){
        List<Integer> l=new ArrayList<Integer>();
        l.add(-2);
        l.add(1);
        l.add(-3);
        l.add(4);
        l.add(-1);
        l.add(2);
        l.add(1);
        l.add(-5);
        l.add(4);
        System.out.println(maxSubArray(l));

    }

}
