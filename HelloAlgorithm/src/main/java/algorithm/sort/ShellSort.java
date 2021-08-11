package algorithm.sort;

import java.util.Arrays;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/10 15:33
 * @Description: 分组
 * 然后使组内有序组间无序,组内排序可以采用
 */
public class ShellSort {
    public void shellSort(int []nums){
        int step = 1;
        while (step<nums.length/3) {
            step = step*3+1;
        }
        for (int i = 0; i < nums.length;i++ ) {
            int temp = nums[i];

            step = (step-1)/3;
        }

    }

    public static void main(String[] args) {
        int [] nums = {14,5,14,2,4,6,8,32,1,0};
        new ShellSort().shellSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
