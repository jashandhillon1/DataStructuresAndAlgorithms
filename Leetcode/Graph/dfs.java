class solution{
    public ArrayList<Integer> dfsOfGraph(int v,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans=new ArrayList<Integer>();
        boolean vis[]=new boolean[v-1];

        for(int i=1;i<=v;i++){
            if(vis[i]==false){
                dfs(vis,adj,i,ans);
            }
        }
        return ans;
    }



    public void dfs(boolean vis, ArrayList<ArrayList<Integer>> adj,int node, ArrayList<Integer> ans){
        ans.add(node);
        vis[node]=true;
        for(Integer it:adj.get(node)){
            if(vis[it]==false){
                dfs(vis,adj,it,ans);
            }
        }
    }
}