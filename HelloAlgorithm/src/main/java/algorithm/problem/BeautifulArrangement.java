package algorithm.problem;

import java.util.*;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/16 15:02
 * @Description:
 * 526. 优美的排列
 */
public class BeautifulArrangement {
    public int counts ;
    public int num;

    public int countArrangement(int n) {
        num = n;
        int[] nums = new int[n+1];
        Arrays.fill(nums,0);
        backtrack(0,nums);
        return counts;
    }
    void backtrack(int trace,int[] selectList){
        if (trace==num) {
            counts++;
            return;
        }
        for(int i = 1; i <=num;i++){
                trace++;
                if((trace%i==0||i%trace==0)&&selectList[i]==0){
                    selectList[i]=1;
                    backtrack(trace,selectList);
                    selectList[i]=0;
                }
                trace--;

        }
    }
}
