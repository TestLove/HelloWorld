package algorithm.problem;

import java.util.HashMap;
import java.util.Map;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/17 13:50
 * @Description:
 * 剑指 Offer 03. 数组中重复的数字
 */
public class FindRepeatNumber {
    /**
     *我的解法: 用Map存每一个数字重复了就返回,但是这样有一个条件没有利用起来
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内
     * @param nums
     * @return
     */
    public int findRepeatNumber1(int[] nums) {
        Map<Integer, Integer> integerHashMap = new HashMap<>(10);
        for (int num : nums) {
            if (integerHashMap.containsKey(num)) {
                return num;
            } else {
                integerHashMap.put(num, 0);
            }
        }
        return 0;

    }

    /**
     * 由于数字范围在0-n-1内所以可以直接把数组本身当做一个Map
     * @param nums
     * @return
     */
    public int findRepeatNumber2(int[] nums) {

        for(int i = 0; i <nums.length; ++i){
            if(nums[i] == i){
                continue;
            }
            if (nums[nums[i]]==nums[i]) {
                return nums[i];
            }else {
                int temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[temp] = temp;
            }
        }
        return 0;

    }
}
