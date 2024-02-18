class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long greater[]  = new long[n];
        Stack <Integer> st = new Stack();
        
        for(int i = n-1 ; i>= 0 ; i-- ){
            
            while(!st.isEmpty()&& arr[st.peek()]  <=  arr[i]){
                st.pop() ; 
                
            }
            
            if(st.isEmpty())
               greater[i] =-1;
            
            else
               greater[i] = arr[st.peek()];
                
            st.push(i);        
        }
        return greater;
    } 
}
