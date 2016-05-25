/**
 * Created by mona on 5/25/16.
 */

import java.util.Arrays;
public class BinarySearch {
    public static boolean binarySearch(int[] a, int num){
        Arrays.sort(a);
        int lower=0;
        int higher=a.length-1;

        while (lower<=higher) {

            int mid=(lower+higher)/2;
            if (a[mid]==num){
                return true;
            }

            else if (a[mid]<num) {
                lower=mid+1;
            }

            else {
                higher=mid-1;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int[] a={1,1,12,11,1,1,2,1,2};
        System.out.println(binarySearch(a,10));
    }
}
