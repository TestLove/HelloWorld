package algorithm.sort;

import java.util.Arrays;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/10 17:28
 * @Description: 计数排序
 * 算法的步骤如下：
 * （1）找出待排序的数组中最大和最小的元素
 * （2）统计数组中每个值为i的元素出现的次数，存入数组C的第i项
 * （3）对所有的计数累加（从C中的第一个元素开始，每一项和前一项相加）
 * （4）反向填充目标数组：将每个元素i放在新数组的第C(i)项，每放一个元素就将C(i)减去1
 */
public class CountingSort {
    public int getMaxValue(int []nums){
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;


    }
    public void countingSort(int[]nums){
        int bucketLength = getMaxValue(nums)+1;
        int []buckets = new int[bucketLength];
        int sum = 0;
        Arrays.fill(buckets,0);
        for (int i = 0; i < nums.length;i++) {
            buckets[nums[i]]++;
            sum++;
        }
        for (int i = 0; i < bucketLength;i++) {
            while (buckets[i] > 0) {
                nums[nums.length-sum] = i;
                buckets[i]--;
                sum--;
            }
        }

    }

    public static void main(String[] args) {
        int [] nums = {14,5,14,2,4,6,8,32,1,0};
        new CountingSort().countingSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
