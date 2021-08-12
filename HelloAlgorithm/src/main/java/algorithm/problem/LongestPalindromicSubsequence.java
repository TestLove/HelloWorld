package algorithm.problem;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/12 16:50
 * @Description:
 * 516 最长回文子序列
 * 最主要的还是状态转移方程
 * dp[i][j] = dp[i+1][j-1]+2;
 * 或者选dp[i+1][j]和dp[i][j-1]中的较大值,因为s[i]或者s[j]可能与旧的字符串构成新的回文序列
 *
 */
public class LongestPalindromicSubsequence {
    public static int longestPalindromeSubsequence(String s) {
        int length = s.length();
        int max = 1;
        int [][]dp = new int[length][length];
        for (int i = 0;i<length;i++) {
            dp[i][i] = 1;
        }
        for(int j = 0;j<length;j++){
            for(int i=j-1;i>=0;i--){
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1]+2;
                }else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;

    }
    public static void main(String[] args) {
        System.out.println(longestPalindromeSubsequence("bdcbbb"));
    }
}
