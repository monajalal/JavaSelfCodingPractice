/**
 * Created by mona on 10/22/15.
 */
public class SearchAndInsert {
    /*
    public int searchInsert(int[] nums, int target) {
        int index=0;
        int end=nums.length;
        int start=1;
        int mid=end/2;
        boolean found=false;


        while (!found){
            if (target==nums[mid]) {
                found = true;
                System.out.println("found!");
                return mid;
            }
            else if (target<nums[mid]){
                end=mid-1;
                mid=(end-start)/2;
            }
            else{
                start=mid+1;
                mid=(end-start)/2;
            }
            if (mid==0){
                if (nums[mid+1]==target){
                    found=true;

                    System.out.println("found here!");
                    return mid+1;
                }
            }
        }


        return mid;
    }
*/
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        return position(nums, 0, nums.length - 1, target);

    }

    private int position(int[] nums, int start, int end, int target) {
        if(start > end){
            return start;
        }

        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return position(nums, start, mid - 1, target);
        } else {
            return position(nums, mid + 1, end, target);
        }

    }
    public static void main(String[] argc){

        int[] sampleArray={1,2,3,5,6,7,8,9};
        int target=4;
        int index;
        SearchAndInsert search=new SearchAndInsert();
        index=search.searchInsert(sampleArray,target);
        System.out.println("index is = [" + index + "]");
        return;
    }
}
