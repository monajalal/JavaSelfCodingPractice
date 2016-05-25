import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mona on 5/25/16.
 */

//check to see if sum of three numbers in array is equal to sum
public class SumOfThree {

    public static List<List<Integer>> sumOfThreeNaive(int[] a, int sum){
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<a.length; i++){
            for (int j=i+1; j<a.length-1; j++){
                for (int k=j+1; k<a.length-2; k++){
                    if (a[i]+a[j]+a[k]==sum){
                        result.add(Arrays.asList(a[i],a[j],a[k]));
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] a={1,3, 7, 8, 3, 9, 2, 4, 10};
        List<List<Integer>> triplets = new ArrayList<>();
        triplets=sumOfThreeNaive(a, 13);
        for (List<Integer> list : triplets){
            for (int triplet: list){
                System.out.print(triplet+" ");
            }
            System.out.println();
        }
    }
}
