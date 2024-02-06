class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
   static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
         ArrayList<Integer> ar=new ArrayList<>();
        if(s==0){
            for(int i=0;i<n;i++)
            {
                if(arr[i]==0)
                {
                    ar.add(i+1);
                    ar.add(i+1);
                    return ar;
                }
            }
            ar.add(-1);
            return ar;
        }
       
        int startIndex=0,endIndex=0,sum=0;
        while(startIndex<=endIndex && endIndex<n)
        {
            sum+=arr[endIndex];
            endIndex++;
            if(sum>s)
                while(sum>s )
                {
                    sum-=arr[startIndex];
                    startIndex++;
                }
                  
            
            if(sum==s)
            {
                ar.add(startIndex+1);
                ar.add(endIndex);
                return ar;
            }
            
        }
        ar.add(-1);
        return ar;
    }

}
