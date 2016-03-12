/**
 * Created by mona on 3/12/16.
 */
public class PeakElementLog {
    public static int PeakElement(int[] nums){
        int len=nums.length;
        int mid;
        if ( len==0 || nums==null){
            return -1;
        }
        else if (len==1){
            return 0;
        }
        else {
            int start=nums[0];
            int end=nums[len-1];
            while (start<=end){
                mid=start+(start+end)/2;
                //mid=(start+end)/2;
                if (mid==0 || (nums[mid] > nums[mid-1] && nums[mid]>nums[mid+1]) ){
                    return mid;
                }
                else if (nums[mid]<nums[mid-1]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }


        }
        return -1;
    }
    public static void main(String[] args){
        int[] a={1,2,3,4,5,3,2,1};
        System.out.println(PeakElement(a));
    }
}
