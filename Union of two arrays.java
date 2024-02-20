class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : a){
            set.add(num);
        }
        for(int num : b){
            set.add(num);
        }
        
        return set.size();
        
    }
}
