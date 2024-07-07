package lcsub;

public class LongestCommonSubstring {
    public static String longestCommonSubstrDP(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        int maxLen = 0;
        int endIdx = -1;
        int[][] dp = new int[m+1][n+1];

        for (int i = 0; i<=m; i++){
            for (int j = 0; j<=n; j++){
                if (i == 0|| j ==0){
                    dp[i][j] = 0;
                }
                else if (str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    if (dp[i][j] > maxLen){
                        maxLen = dp[i][j];
                        endIdx = i - 1;
                    }
                }
                else {
                    dp[i][j] = 0;
                    maxLen=Math.max(dp[i][j], maxLen);
                }
            }
        }
        String subStr = str1.substring(endIdx - maxLen + 1, endIdx + 1);
        return subStr;
    }
    public static void main(String[] args){
        String a = "ABCQEFDEFGHIJ";
        String b = "BCXEFGYZBCDEWEFGHU";
        String result = longestCommonSubstrDP(a,b);
        System.out.println(result); // EFGH
    }
}
