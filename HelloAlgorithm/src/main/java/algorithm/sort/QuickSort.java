package algorithm.sort;

import java.util.Arrays;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/9 11:36
 * @Description: 快速排序
 * 难点在于指针的临界处,看最后一个小于等于临界值的索引在哪里
 * 特殊情况下在right,
 */
public class QuickSort {
    public void quickSort(int [] nums,int left,int right){
        if (left<right) {
            int partition  = partition(nums,left,right);
            quickSort(nums, left,partition-1);
            quickSort(nums, partition+1, right);
        }
    }
    public int partition(int[] nums,int left,int right){
        int pivot = left;
        while (left<right) {
            if(nums[right]<nums[pivot]){
                while (nums[left]<=nums[pivot]) {
                    left++;
                }
                if (left<right) {
                    swap(nums,left,right);
                }
            }else {
                right--;
            }
        }
        swap(nums, right,pivot);
        return right;
    }
    public void swap(int[] nums,int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;


    }
    public static void main(String[] args) {
        int [] nums = {14,5,14,2,4,6,8,32,1,0};
        new QuickSort().quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }


}
