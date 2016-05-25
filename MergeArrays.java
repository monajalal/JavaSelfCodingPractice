/**
 * Created by mona on 5/24/16.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MergeArrays {

    public static String[] mergeAndSortStringArrays(String[] first, String[] second){
        List<String> merged = new ArrayList<>();
        Collections.addAll(merged,first);
        Collections.addAll(merged,second);
        Collections.sort(merged);
        return merged.toArray(new String[merged.size()]);
    }

    public static int[] mergeAndSortIntArrays(int[] firstInt, int[] secondInt){

        List<Integer> merged = new ArrayList<>();

        for (int i=0; i<firstInt.length; i++){
            merged.add(firstInt[i]);
        }

        for (int i=0; i<secondInt.length; i++){
            merged.add(secondInt[i]);
        }

        Collections.sort(merged);
        int[] result=new int[merged.size()];
        for (int i=0; i<merged.size(); i++){
            result[i]=merged.get(i);
        }
        return result;
    }


    public static void main(String[] args){
        String[] first={"hi", "mona", "how", "are", "you"};
        String[] second={"hello", "world", "good", "morning", "USA"};
        String[] merged=mergeAndSortStringArrays(first, second);
        for (int i=0; i<merged.length; i++){
            System.out.print(merged[i]+" ");
        }

        int[] firstInt={1, 4, 2, 6, 7};
        int[] secondInt={2, 8, 2, 9, 1, 12};
        int[] resultedMerge=mergeAndSortIntArrays(firstInt, secondInt);
        for (int i=0; i<resultedMerge.length; i++){
            System.out.print(resultedMerge[i]+" ");
        }
    }
}
