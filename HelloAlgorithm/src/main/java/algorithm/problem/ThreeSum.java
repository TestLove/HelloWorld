package algorithm.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/7/28 17:07
 * @Description:
 * 将一个数定下来,然后求另外两数之和为定数的绝对值,用排序后双指针减少比较次数,也不一定用双指针,hash表也行,但是hash表每次包含的数是不同的
 */
public class ThreeSum {
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> answers = new ArrayList();
        Arrays.sort(nums);
        int n = nums.length;
        if(n>=3){
            if(nums[0]>0||nums[n-1]<0){
                return answers;
            }
            for(int first = 0;first<n;first++){
                if(first>0&&nums[first]==nums[first-1]){
                    continue;
                }
                int third = n-1;
                for(int second = first+1;second<n;second++){
                    if(second>first+1&&nums[second]==nums[second-1]){
                        continue;
                    }
                    while(second<third&& nums[second]+nums[third]+nums[first]>0){
                        third--;
                    }

                    if(second==third){
                        break;
                    }
                    if(nums[second]+nums[third]+nums[first]==0){
                        List<Integer> element = new ArrayList();
                        element.add(nums[first]);
                        element.add(nums[second]);
                        element.add(nums[third]);
                        answers.add(element);

                    }
                }
            }
        }
        return answers;

    }
    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> answers = new ArrayList();
        Arrays.sort(nums);
        int n = nums.length;
        if(n>=3){
            if(nums[0]>0||nums[n-1]<0){
                return answers;
            }
            for(int first = 0;first<n;first++){
                if(first>0&&nums[first]==nums[first-1]){
                    continue;
                }
                int third = n-1;
                int second = first+1;
                while(second<third){
                    if(nums[second]+nums[third]+nums[first]<0){
                        second++;
                    }
                    else if(nums[second]+nums[third]+nums[first]>0){
                        third--;
                    }
                    else{
                        List<Integer> element = new ArrayList();
                        element.add(nums[first]);
                        element.add(nums[second]);
                        element.add(nums[third]);
                        answers.add(element);
                        while(second<third&&nums[second]==nums[second+1])second++;
                        while(second<third&&nums[third]==nums[third-1])third--;
                        second++;
                        third--;
                    }


                }
            }
        }
        return answers;

    }
    public static void main(String[] args) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
    }
}
