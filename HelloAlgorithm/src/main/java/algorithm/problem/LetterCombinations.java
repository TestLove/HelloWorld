package algorithm.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/14 15:28
 * @Description: 17. 电话号码的字母组合
 */
public class LetterCombinations {
    List<String> result = new ArrayList();
    Map<Character,String> elements;
    public List<String> letterCombinations(String digits) {
        elements = new HashMap();
        elements.put('2',"abc");
        elements.put('3',"def");
        elements.put('4',"ghi");
        elements.put('5',"jkl");
        elements.put('6',"mno");
        elements.put('7',"pqrs");
        elements.put('8',"tuv");
        elements.put('9',"wxyz");
        if(!digits.isEmpty()){
            backtrack("",digits,0);
        }

        return result;


    }
    void backtrack(String trace,String digits,int index){
        if(trace.length()==digits.length()){
            result.add(trace);
            return;
        }
        Character ch = digits.charAt(index);
        String candidate = elements.get(ch);
        for(int i = 0;i<candidate.length();i++){
            trace+=candidate.substring(i,i+1);
            backtrack(trace,digits,index+1);
            trace = trace.substring(0,trace.length()-1);
        }
    }
}
