class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean arr[]=new boolean[adj.size()];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!arr[curr]) {
                ans.add(curr);
                arr[curr] = true;

                for (int i = 0; i < adj.get(curr).size(); i++) {
                    int e = adj.get(curr).get(i);
                    if (!arr[e]) {
                        q.add(e);
                    }
                }
            }
        }
        return ans;
    }
    
}
