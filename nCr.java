class Solution{
    static int nCr(int n, int r)
    {
        int dp[][]=new int[2][r+1];
        dp[0][0]=1;
        dp[1][0]=1;
        for(int i=1;i<=r;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=r;j++){
                dp[i%2][j]=((dp[(i-1)%2][j])%1000000007+(dp[(i-1)%2][j-1])%1000000007)%1000000007;
            }
        }
        return dp[n%2][r];
        
    }
}
