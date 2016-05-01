/**
 * Created by mona on 4/30/16.
 */

//from Facebook CodeLab interviewbit challenges
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class returnUnique {

    public int singleNumber(final List<Integer> a) {
        int len= a.size();
        Map<Integer, Integer> numberCount = new HashMap<>();
        for (int i=0; i< len; i++){
            if (numberCount.containsKey(a.get(i))){

                numberCount.put(a.get(i), numberCount.get(a.get(i))+1);
            }
            else {
                numberCount.put(a.get(i), 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry: numberCount.entrySet()){
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }

        return -1;


    }

}
