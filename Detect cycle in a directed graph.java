class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean []visited = new boolean[V];
        boolean []pathVisited = new boolean[V];
        
        for(int i = 0; i < V; i++){
            if(!visited[i]){
                boolean ans = isCyclicUsingDFS(i, visited, pathVisited, adj);
                // System.out.println(ans);
                if(ans == true){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean isCyclicUsingDFS(int i, boolean []visited,  boolean []pathVisited,ArrayList<ArrayList<Integer>> adj){
        visited[i] = true;
        pathVisited[i] = true;
        
        for(int neighbour : adj.get(i)){
            if(!visited[neighbour]){
                boolean isCycleExist = isCyclicUsingDFS(neighbour, visited, pathVisited, adj);
                if(isCycleExist){
                    return true;
                }
            }
            else if(pathVisited[neighbour] == true){
                return true;
            }
        }
        
        pathVisited[i] = false;
        
        return false;
    }
}
