class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ansList = new ArrayList<>();
        HashMap<Integer,Integer> FreqMap = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < n; i++){
            if(FreqMap.containsKey(arr[i])){
                FreqMap.put(arr[i], FreqMap.get(arr[i]) + 1);
            }else{
                FreqMap.put(arr[i],1);
            }
        }
        
        for(int i : FreqMap.keySet()){
            if(FreqMap.get(i) > 1){
                ansList.add(i);
            }
        }
        if(ansList.isEmpty()){
            ansList.add(-1);
        }
        Collections.sort(ansList);
        return ansList;
    }
}
