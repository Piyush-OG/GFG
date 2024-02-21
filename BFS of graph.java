public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        HashSet<Integer> visited = new HashSet<Integer>();
        Queue<ArrayList<Integer>> que = new LinkedList<ArrayList<Integer>>();
        que.add(adj.get(0));
        visited.add(0);
        ans.add(0);
        while(!que.isEmpty()){
            ArrayList<Integer> temp = que.poll();
            for(int i=0;i<temp.size();i++){
                if(!visited.contains(temp.get(i))){
                    que.add(adj.get(temp.get(i)));
                    visited.add(temp.get(i));
                    ans.add(temp.get(i));
                }
            }
        }
        return ans;
    }

