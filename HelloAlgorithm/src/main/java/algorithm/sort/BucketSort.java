package algorithm.sort;

import java.util.Arrays;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/10 20:15
 * @Description:
 * 对于整数,用计数排序就好,但对于浮点数,就没办法采用值作为数组,
 * 因此需要转换一下,将浮点数转换为整数(即递增的函数),并且保证浮点数递增,
 * 那么所获得的桶的索引也要是有递增趋势的
 *
 * 然后将桶内的元素有序排列
 *
 * 最后遍历所有桶,将数据按顺序返回
 */
public class BucketSort {
    class Bucket{
        int counts;
        double[] values = new double[10];
        public void add(double value){
            values[counts] = value;
            counts++;
            for (int i = 0; i < counts;i++) {
                if (values[i]<value) {
                    for (int j = counts; j>i;j--){
                        values[j] = values[j-1];
                    }
                    values[i] = value;
                }
            }
        }
        public double get(){
        return values[--counts];
        }
    }
    Bucket [] buckets;

    public int mapBucket(double original){
        return (int)Math.round(original)%buckets.length;
    }
    public void bucketSort(double[] nums){
        buckets = new Bucket[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            buckets[i] = new Bucket();
        }
        for (int i = 0; i < nums.length;++i) {
            buckets[mapBucket(nums[i])].add(nums[i]);
        }
        for (int i = 0; i < nums.length;i++) {
            while(buckets[i].counts!=0){
                nums[count++] = buckets[i].get();
            }
        }
    }

    public static void main(String[] args) {
        double [] nums = {1,5,1,2,4,6,8,3,1,0};
        new BucketSort().bucketSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
