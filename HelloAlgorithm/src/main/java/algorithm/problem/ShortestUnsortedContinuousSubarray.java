package algorithm.problem;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/9/2 17:14
 * @Description:
 * 581. 最短无序连续子数组
 * 核心思路就是结果[i,j].,nums[i-1]<min(nums[i,j]nums[j+1] nums[j+1]>max(nums[i,j]))
 */
public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
        int max = nums[0];
        int length = 0 ;
        int left = 0;
        for(int right = 1;right<nums.length;right++){
            if(nums[right]>=nums[left]&&length==0){
                left++;
            }
            if(nums[right]<max){
                if(nums[right]<nums[left]){
                    while(left>0){
                        if(nums[right]<nums[left-1]){
                            left--;
                        }else{
                            break;
                        }
                    }
                }
                length = right-left+1;
            }
            max = Math.max(max,nums[right]);
        }
        return length;


    }
    public int findUnsortedSubarray2(int[] nums) {
        int n = nums.length;
        int i = 0, j = n - 1;
        while (i < j && nums[i] <= nums[i + 1]) i++;
        while (i < j && nums[j] >= nums[j - 1]) j--;
        int l = i, r = j;
        int min = nums[i], max = nums[j];
        for (int u = l; u <= r; u++) {
            if (nums[u] < min) {
                while (i >= 0 && nums[i] > nums[u]) i--;
                min = i >= 0 ? nums[i] :Integer.MIN_VALUE;
            }
            if (nums[u] > max) {
                while (j < n && nums[j] < nums[u]) j++;
                max = j < n ? nums[j] : Integer.MAX_VALUE;
            }
        }
        return j == i ? 0 : (j - 1) - (i + 1) + 1;
    }
}
