/**
 * Created by mona on 3/7/16.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

    public static long biCoeff(int n, int k){
        if (n==k){
            return (long) 1;
        }
        if (n==0){
            return (long) n;
        }

        return (biCoeff(n-1, k-1)+biCoeff(n-1,k));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mylist = new ArrayList<>();
        for (int i=0; i<=numRows; i++){
            mylist.add(new ArrayList<Integer>());
            for (int j=0; j<=i; j++) {
                mylist.get(i).add((int) biCoeff(i, j));
            }

        }
        return mylist;
    }


    public static void main(String[] args){
        List<List<Integer>> l = new ArrayList<>();

        l=generate(5);

        for (List<Integer> list:l){
            System.out.print("[");
            for (Integer i: list){
                System.out.print(i + ",");
            }
            System.out.println("],");
            System.out.println();
        }


    }
}
