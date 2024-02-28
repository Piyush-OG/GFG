class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        
        for(int i=0; i<n; i++){
            int start = i+1;
            int end = n-1;
            
            while(start < end){
                
                int triplet = arr[i] + arr[start] + arr[end];
                
                if(triplet == 0){
                    return true;
                }else if(triplet < 0){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return false;
    }
}
