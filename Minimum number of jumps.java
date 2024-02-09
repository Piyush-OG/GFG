class Solution{
    static int minJumps(int[] arr){
        // your code here
        int n=arr.length;
        
        if(n==1){
            return 0;
        }
        if(arr[0]==0){
            return -1;
        }
        int jumps=0;
        int max1=0;
        int range=0;
        
        for(int i=0;i<n;i++){
            max1=Math.max(max1,i+arr[i]);
            if(range==i){
                range=max1;
                jumps++;
                if(range>=n-1){
                    return jumps;
                }
            }
        }
        
        
        return -1;
    }
}
