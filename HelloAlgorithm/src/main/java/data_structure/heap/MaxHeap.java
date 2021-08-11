package data_structure.heap;


/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/10 10:58
 * @Description: 堆数据结构
 * 用于插入数据和寻找最值
 */
public class MaxHeap implements Heap{
    int [] nums;
    public int length;
    @Override
    public void siftUp(int i) {
        while (i>1) {
            if (nums[i/2-1]<nums[i-1]) {
                swap(nums,i/2-1,i-1);
            }
            i = i/2;
        }


    }
    @Override
    public void siftDown(int i){
        //此时i所处节点就是叶子节点
        if (2*i>length) {
            return;
        }
        //i所处节点不是叶子节点
        i = 2*i;
        //其右子节点有值,判断左右节点哪个值大,然后指针指向他,把三个节点中的最大值变为父节点
        while(i<=length){
            if(i+1<=length&&(nums[i-1]<nums[i])){
                i=i+1;
            }
            if(nums[i/2-1]<nums[i-1]){
                swap(nums,i/2-1,i-1);
            }else {
                break;
            }
            i=2*i;
        }

    }
    @Override
    public void insert(){

    }
    @Override
    public void delete(int i){
        int x = nums[i-1];
        int y = nums[length-1];
        length = length-1;
        //删除的是最后一个数
        if(i==length+1){
            return;
        }
        nums[i-1] = y;
        if(y>=x){
            siftUp(i);
        }else {
            siftDown(i);
        }

    }
    @Override
    public int deleteMax(){
        int x = nums[0];
        delete(1);
        return x;

    }

    /**
     * 从第一个非叶子节点开始往下渗透
     * @param newNums
     */
    @Override
    public void makeHeap(int[] newNums){
        nums = newNums;
        length = nums.length;
        for (int i = length; i >=0; --i) {
            siftDown(i+1);
        }



    }
    public void swap(int[] nums,int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;


    }

}
