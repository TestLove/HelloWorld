package algorithm.sort;

import data_structure.heap.MaxHeap;

import java.util.Arrays;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/10 10:47
 * @Description: 堆排序
 * 主要问题是把堆构建出来
 */
public class HeapSort {
    public static void main(String[] args) {
        int [] nums = {14,5,2,4,6,8,32,1,0};
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.makeHeap(nums);
//        for (int i = 0; i < nums.length;i++) {
//            System.out.print(maxHeap.deleteMax()+" ");
//        }
        for (int i = 0; i < nums.length;i++) {
            maxHeap.swap(nums,0, maxHeap.length-1);
            maxHeap.length--;
            maxHeap.siftDown(1);
        }
        System.out.println(Arrays.toString(nums));


    }
}
