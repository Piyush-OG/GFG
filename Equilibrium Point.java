class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
   public static int equilibriumPoint(long arr[], int n) {

         int leftSum=0;
        int sum=0;
        for(int i=0;i<n;i++) {
            sum +=arr[i];
        }
        
        for(int i=0;i<n;i++) {
            sum-=arr[i];
            if(sum == leftSum) {
                return i+1;
                
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
