class Solution{
    static class Pair implements Comparable<Pair>{
        char ch;
        int count;
        Pair(char c,int v){
            this.ch = c;
            this.count = v;
        }
        @Override
        public int compareTo(Pair p){
            return p.count-this.count;
        }
    }
    
    static int minValue(String s, int k){
        int n = s.length();
        Map<Character,Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int count = map.get(ch);
                map.put(ch,count+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int size = map.size();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(Map.Entry<Character,Integer> pair : map.entrySet()){
            pq.add(new Pair(pair.getKey(),pair.getValue()));
        }
        // for(Pair p : pq){
        //     System.out.println(p.ch+" "+p.count);
        // }
        
        while(!pq.isEmpty() && k>0){
            Pair p = pq.poll();
            pq.add(new Pair(p.ch,p.count-1));
            k--;
        }
        int ans=0;
        for(Pair p : pq){
            ans += Math.pow(p.count,2);
        }
        return ans;
    }
}
