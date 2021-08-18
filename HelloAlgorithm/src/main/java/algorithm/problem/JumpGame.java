package algorithm.problem;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/18 15:43
 * @Description: null
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int max= 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0&&i!=nums.length-1&&max<=i){
                return false;
            }
            max = Math.max(max,i+nums[i]);
        }
        return true;

    }
}
