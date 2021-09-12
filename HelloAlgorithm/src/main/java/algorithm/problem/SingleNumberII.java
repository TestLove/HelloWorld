package algorithm.problem;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/9/4 16:04
 * @Description:
 * 137. 只出现一次的数字 II
 */
public class SingleNumberII {
    /**
     * 1. 最先想到的应该是先排序,再遍历,可是排序算法最好也是nlogn,因此不能这么搞
     * 2. 要求线性时间复杂度,也就是说只能通过几次遍历来完成,我们可以通过HashMap来存储每个数字出现的次数,最后再遍历一次HashMap来获取答案
     * 3. 算出每个二进制位,三个一消
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(8);
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey((Integer) nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        AtomicInteger answer = new AtomicInteger();
        map.forEach((Integer k,Integer v)->{
            if(v==1){
                answer.set(k);

            }
        });
        return answer.get();

    }
}
