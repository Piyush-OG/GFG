class Solution{
    
    public static boolean check(long A[],long B[],int N)
    {
        Map<Long,Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            if(!map.containsKey(A[i])) map.put(A[i],1);
            else map.put(A[i],map.get(A[i])+1);
        }
        for(int i=0; i<N;i++){
            if(!map.containsKey(B[i]) || map.get(B[i])==0) return false;
            else map.put(B[i],map.get(B[i])-1);
        }
        return true;
    }
}
