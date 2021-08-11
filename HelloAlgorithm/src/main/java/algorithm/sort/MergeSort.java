package algorithm.sort;

import java.util.Arrays;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/10 9:39
 * @Description: 分治的思想,递归分,到最小单位后其实就是两个有序数组,然后再合并两个有序数组,由于有序,顺序比较即可
 */
public class MergeSort {
    public void mergeSort(int[] nums,int left,int right){
        if(left<right){
            int divisionIndex = (left+right)/2;
            mergeSort(nums,left,divisionIndex);
            mergeSort(nums, divisionIndex+1, right);
            merge(nums,left,divisionIndex,divisionIndex+1,right);
        }
    }

    /**
     * 把两个有序数组合并
     * @param nums
     * @param begin1
     * @param end1
     * @param begin2
     * @param end2
     */
    public void merge(int[]nums,int begin1,int end1,int begin2,int end2){
        int length = end2-begin1+1;
        int []temp = new int[length];
        int a = begin1;
        int distance = begin2-begin1;
        for (int i = 0; i < length;i++ ){

            if (begin1>end1&&begin2<=end2) {
                temp[i] = nums[begin2];
                begin2++;

            }else if(begin1<=end1 &&begin2>end2){
                temp[i] = nums[begin1];
                begin1++;

            }else if (nums[begin1]<=nums[begin2]) {
                temp[i] = nums[begin1];
                begin1++;
            }else if (nums[begin1]>nums[begin2]){
                temp[i] = nums[begin2];
                begin2++;
            }
        }
        for (int i = 0; i <length; i++){
            nums[a+i] = temp[i];
        }

    }

    public static void main(String[] args) {
        int [] nums = {14,5,14,2,4,6,8,32,1,0};
        new MergeSort().mergeSort(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
