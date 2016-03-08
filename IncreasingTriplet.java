/**
 * Created by mona on 3/4/16.
 * leetcode
 * find if an array has an increasing triple
 */
public class IncreasingTriplet {
    public static boolean isIncreasingTriplet(int[] a){
        for (int i=0; i<a.length-3; i++){
            if (a[i]<a[i+1]){
                if (a[i+1]<a[i+2]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main (String[] args){
        int[] a={1,2,1,3,1,2};
        System.out.println(isIncreasingTriplet(a));
    }
}
