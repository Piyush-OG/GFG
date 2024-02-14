class Solution {
    public static long seriesSum(int n) {
        long sum = 0;
        for(int i=1; i<=n; i++){
            sum= (long) n*(n+1)/2;
            // or we can also write sum+=i;
        }
        return sum;
    }
    }
        
