class Solution {
   public int getPaths(int m, int n, int[][] dp){
        
        if(n == 1 || m == 1) return 1;
        
        if(dp[m-1][n] == 0) dp[m-1][n] = getPaths(m-1, n, dp);
        
        if(dp[m][n-1] == 0) dp[m][n-1] = getPaths(m, n-1, dp);
        
        return dp[m-1][n] + dp[m][n-1];
    }
    
    public int uniquePaths(int m, int n) {
        
        int[][] dp = new int[m+1][n+1];
        
        return getPaths(m,n,dp);
    }
}