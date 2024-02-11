class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr)pq.add(i);
        int i = 1;
        while(i < k){
            pq.remove();
            i++;
        }
        return pq.peek();
    } 
}
