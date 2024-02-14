class Solution {
    int print2largest(int arr[], int n) {
        Arrays.sort(arr);
        int start=0;
        int end=n-1;
        int temp=0;
        while(start<end)
        {
             temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        int count=1;
        int prev=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=prev)
            {
                count++;
                prev=arr[i];
            }
            if(count==2)
                return arr[i];
        }
        return -1;
    }
}
