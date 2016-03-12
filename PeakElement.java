/**
 * Created by mona on 3/12/16.
 */
public class PeakElement {
    public static int findPeakElement(int[] nums) {
        int len=nums.length;
        if (nums.length==1){
            return 0;
        }
        else {
            if (nums[0] > nums[1]){
                return 0;
            }
            for (int i=1; i<len-1; i++){
                if (nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                    return i;
                }
            }
            if (nums[len-1]> nums[len-2]){
                return len-1;
            }
            return -1;
        }

    }
    public static void main(String[] args){
        int[] a={1, 2, 3, 4, 2 , 1};
        System.out.println(findPeakElement(a));
    }
}
