class Sort implements Comparator<ArrayList<Integer>>

{

    public int compare(ArrayList<Integer> a, ArrayList<Integer> b)

    {

        int x=a.get(0)-b.get(0);

        int y=a.get(1)-b.get(1);

        return x==0?y:x;

    }

}

class Solution

{

    int timer=0;

    public void dfs(int node,int parent,ArrayList<ArrayList<Integer>> adj,int[] tin,int[] low,boolean[] visited,ArrayList<ArrayList<Integer>> bridges)

    {

        visited[node]=true;

        tin[node]=low[node]=timer;

        timer++;

        

        for(int adjNode:adj.get(node))

        {

            if(adjNode==parent)

                continue;

                

            if(!visited[adjNode])

            {

                dfs(adjNode,node,adj,tin,low,visited,bridges);

                

                low[node]=Math.min(low[node],low[adjNode]);

                

                if(low[adjNode]>tin[node])

                {

                    ArrayList<Integer> bridge=new ArrayList<Integer>();

                    bridge.add(node);

                    bridge.add(adjNode);

                    Collections.sort(bridge);

                    bridges.add(bridge);

                }

            }

            else

                low[node]=Math.min(low[adjNode],low[node]);

        }

    }

    

    public ArrayList<ArrayList<Integer>> criticalConnections(int V, ArrayList<ArrayList<Integer>> adj)

    {

        int[] tin=new int[V];

        int[] low=new int[V];

        boolean[] visited=new boolean[V];

        

        ArrayList<ArrayList<Integer>> bridges=new ArrayList<>();

        dfs(0,-1,adj,tin,low,visited,bridges);

        Collections.sort(bridges,new Sort());

        return bridges;

    }

}
