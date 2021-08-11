package algorithm.problem;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/7/30 23:16
 * @Description: null
 */
public class LongestPalindromicSubstring {
    /**
     * 动态规划,以两个指针的位置为状态变量
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        int len = s.length();
        int maxL =0;
        int maxR = 0;
        int [][]dp = new int[len][len];
        for(int i = 0;i<len;i++){
            dp[i][i] = 1;
        }
        for(int i= 0;i<len;i++){
            for(int j = i+1;j<len;j++){
                boolean flag1 = dp[i+1][j-1]==1&&i+1<=j-1;
                boolean flag2 = dp[j-1][i+1] == 1 && i+1 > j-1;
                boolean flag3 = s.charAt(i)==s.charAt(j);
                if((flag1||flag2)&&flag3){
                    dp[i][j] = 1;
                    if(j-i>maxR-maxL){
                        maxR=j;
                        maxL=i;
                    }
                }else{
                    dp[i][j]=0;
                }
            }

        }
        return s.substring(maxL,maxR+1);

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }
}
