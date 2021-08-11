package algorithm.problem;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/5/26 17:00
 * @Description:
 * 给出一个字符串 s（仅含有小写英文字母和括号）。
 *
 * 请你按照从括号内到外的顺序，逐层反转每对匹配括号中的字符串，并返回最终的结果。
 *
 * 注意，您的结果中 不应 包含任何括号。
 *
 */
public class ReverseSubstringsBetweenEachPairOfParentheses {
    /**
     * 使用栈
     * @param s
     * @return
     * 以字符为单位进行移动操作
     */
    public String reverseParentheses1(String s) {
        Stack<Character> stack = new Stack();
        Queue<Character> queue = new LinkedList<>();
        StringBuilder answer= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) !=')' ){
              stack.push(s.charAt(i));
            }else {
                while (stack.peek()!= '(' && !stack.isEmpty()){
                    queue.add(stack.pop());
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }

                while(!queue.isEmpty()){
                    stack.push(queue.remove());
                }
            }

        }
        while (!stack.isEmpty()){
            answer.append(stack.pop());
        }
        return answer.reverse().toString();

    }

    /**
     * 以字符串为基本单位进行操作
     * @param s
     * @return
     */
    public String reverseParentheses2(String s){
        Deque<String> stack = new LinkedList<String>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                //从(开始一个新的字符串,把原来的字符串放入栈中
                stack.push(sb.toString());
                sb.setLength(0);
            } else if (ch == ')') {
                //遇见)则此次拼接结束,把当前栈里的字符串加入到先前的字符串中
                sb.reverse();
                sb.insert(0, stack.pop());
            } else {
                //用于构建一个间隔内的字符串
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    /**
     * 预处理括号,我觉得这个方法一般人想不出来,还是官方题解强
     * @param s
     * @return
     */
    public String reverseParentheses3(String s){
        int n = s.length();
        int[] pair = new int[n];
        Deque<Integer> stack = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                int j = stack.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }

        StringBuffer sb = new StringBuffer();
        int index = 0, step = 1;
        while (index < n) {
            if (s.charAt(index) == '(' || s.charAt(index) == ')') {
                index = pair[index];
                step = -step;
            } else {
                sb.append(s.charAt(index));
            }
            index += step;
        }
        return sb.toString();
    }
}
