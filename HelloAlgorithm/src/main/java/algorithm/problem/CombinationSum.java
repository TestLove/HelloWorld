package algorithm.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/28 12:35
 * @Description:
 * 39. 组合总和
 */
public class CombinationSum {
    List<List<Integer>> results = new ArrayList();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(new ArrayList<Integer>(),0,0,candidates,target);
        return results;

    }
    void backtrack(List<Integer> trace,int sum,int index,int[] candidates,int target){
        if(sum==target){
            results.add(new ArrayList(trace));
            return;
        }
        if(sum>target){
            return;
        }
        for(int i = index;i<candidates.length;i++){
            trace.add(candidates[i]);
            backtrack(trace,sum+candidates[i],i,candidates,target);
            trace.remove((Integer)candidates[i]);
        }

    }
}
