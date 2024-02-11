class Solution
{
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i=0;i<size;i++){
            int value = mpp.getOrDefault(a[i], 0);
            mpp.put(a[i],value+1);
        }
        
        for(Map.Entry<Integer, Integer> it : mpp.entrySet()){
            if(it.getValue() > (size/2)){
                return it.getKey();
            }
        }
        return -1;
    }
}
