//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{
    static int mod = 1000000007;
	public int perfectSum(int arr[],int n, int sum) 
	{ 
        //first sort array decending order for maintain when array contin 0.
	    Arrays.sort(arr);
	    reverse(arr);
	    
	    int dp[][] = new int[arr.length+1][sum+1];
	    for(int row[] : dp){
	        Arrays.fill(row,-1);
	    }
        
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<=sum;j++){
                if(i==0 && j==0){
                    dp[i][j] = 1;
                }else if(i==0 && j>0){
                    dp[i][j] = 0;
                }else if(arr[i-1]>j){//row>col then copy from upper
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = (dp[i-1][j] + dp[i-1][j-arr[i-1]])%mod;
                }
            }
        }
        
        return dp[dp.length-1][dp[0].length-1];
        
	}

	public static void reverse(int[] arr)
    {
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        
    }
	
}