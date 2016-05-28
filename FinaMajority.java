/**
 * Created by mona on 5/27/16.
 */

import java.util.Arrays;

public class FinaMajority {
    public static int findMajority(int[] a) {
        Arrays.sort(a);
        int maxCount = Integer.MIN_VALUE;
        int maxIdx = Integer.MIN_VALUE;
        for (int i=0; i<a.length; i++) {
            int count = 0;
            while ( (i+count) < a.length && a[i] == a[i+count]) {
                count++;
                if (count == a.length/2) {
                    return a[i];
                }
                if (count > maxCount) {
                    maxCount = count;
                    maxIdx = i;
                }
            }
        }
        return a[maxIdx];
    }

    public static void main(String[] args) {
        int[] a = {3,1,2,2,3,2,2,4,4,3,5,2,3,1,3,4,3,3,3};
        System.out.println(findMajority(a));
    }

}

