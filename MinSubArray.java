/**
 * Created by mona on 5/24/16.
 */
public class MinSubArray {

    public static void minSubArray(int[] a, int k){

        int start=-1;
        int end=-1;
        int min=Integer.MAX_VALUE;

        for (int i=0; i<a.length; i++){
            int tmpSum=0;
            for (int j=i; j<a.length && (j-i+1)<min ; j++){
                tmpSum+=a[j];
                if (tmpSum==k){
                    start=i;
                    end=j;
                    min=end-start+1;
                    break;
                }
                if (tmpSum>k){
                    break;
                }
            }
        }

        if (start==-1 || end==-1){
            System.out.println("No such array exists with sum of "+k);
        }
        while (start<=end){
            System.out.print(a[start]+" ");
            start++;
        }

       // return min;

    }

    public static void main(String[] args){
        int a[] ={1,2,3,-1,2,4,8,9,5,6,-2,-3,10};
        minSubArray(a,5);

    }
}
