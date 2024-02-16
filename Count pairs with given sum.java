class Solution {
    int getPairsCount(int[] arr, int n, int k) {
     HashMap<Integer,Integer>set= new HashMap<>();
     int count=0;
     int num=0;
     for(int i=0;i<n;i++){
         num=arr[i];
         if(set.containsKey(k-num)){
             count+=set.get(k-num);
         }
         if(set.containsKey(num)){
             set.put(num,set.get(num)+1);
         }
         else{
             set.put(num,1);
         }
        
     }
     return count; 
}
}
