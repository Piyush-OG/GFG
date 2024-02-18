class Solution {
    
    private class VertexInfo {
        int val;
        int parent;
        
        public VertexInfo(int val, int parent) {
            this.val = val;
            this.parent = parent;
        }
    }
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        
        for(int i = 0; i < V; i++) {
            if(!vis[i] && detectCycle(adj, vis, i)) return true;
        }
        
        return false;
    }
    
    private boolean detectCycle(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int startVal) {
        Queue<VertexInfo> queue = new LinkedList<>();
        queue.offer(new VertexInfo(startVal, -1));
        vis[startVal] = true;
        
        while(!queue.isEmpty()) {
            VertexInfo vertex = queue.poll();
            
            for(int neighbor : adj.get(vertex.val)) {
                if(neighbor == vertex.parent) continue;
                
                if(vis[neighbor]) return true;
                
                queue.offer(new VertexInfo(neighbor, vertex.val));
                vis[neighbor] = true;
            }
        }
        
        return false;
    }
}
