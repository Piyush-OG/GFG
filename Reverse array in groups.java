class Solution {
   
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        
        for(int i=0; i<n; i+=k){
            reverseArray(i,Math.min(n-1,i+k-1),arr);
        }
    }


    public static void reverseArray(int start, int end, ArrayList<Integer> arr){


        while(start<end){
            int temp = arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++; end--;
        }
    }


}

