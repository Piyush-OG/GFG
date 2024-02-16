class Solution
{
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int plat_needed = 1;
        int dep_index =0;
        for(int i = 1 ; i< n ; i++)
        {
            if(dep[dep_index] < arr[i]) dep_index++;
            
            else if(dep[dep_index] >= arr[i]) {
                plat_needed ++;
            }
        }
     return plat_needed;   
    }
    
}
