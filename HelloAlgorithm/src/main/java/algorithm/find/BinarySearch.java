package algorithm.find;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/13 16:22
 * @Description: null
 */
public class BinarySearch {
    int [] nums;

    /**
     * 找到与给定值相等的值的下标
     */
    public int binarySearch(int value){
        int low = 0,high = nums.length - 1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==value){
                return mid;
            }else if(nums[mid]<value){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;

    }
}
