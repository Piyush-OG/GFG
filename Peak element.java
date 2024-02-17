class Solution
{
    public int peakElement(int[] arr,int n)
    {
        int peak=0;
        for(int i=0;i<n;i++)
        {
            if(i<n-1 && arr[i]>arr[i+1])
            {
                  peak=i;
                  return peak;
            }
        }
        peak=n-1;
        return peak;
    }
    
}
