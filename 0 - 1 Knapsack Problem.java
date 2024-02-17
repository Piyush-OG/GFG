class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) {
        int[][] dp = new int[n][W + 1];
        for (int w = wt[0]; w <= W; w++) {
            if (wt[0] <= W) {
                dp[0][w] = val[0];
            } else {
                dp[0][w] = 0;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= W; j++) {
                int include = 0;
                if (wt[i] <= j) {
                    include = dp[i - 1][j - wt[i]] + val[i];
                }
                int exclude = dp[i - 1][j];

                dp[i][j] = Math.max(include, exclude);
            }
        }
        
        return dp[n - 1][W];
    }
}
