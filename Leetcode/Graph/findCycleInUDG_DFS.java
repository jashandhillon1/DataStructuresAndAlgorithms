class solution{
    public boolean cycle(int v,ArrayList<ArrayList<Integer>> adj){
        boolean vis[]=new boolean[v-1];
        Arrays.fill(vis,false);

        for(int i=1;i<=v;i++){
            if(vis[i]==false){
                if(helper(vis,i,adj,-1)){
                    return true;
                }
            }
        }
        return false;
    }


    public boolean helper( boolean vis,int node,ArrayList<ArrayList<Integer>> adj,int par){
        vis[node]=true;
        for(Integer it: adj.get(node)){
            if(vis[it]==false){
                if(helper(vis,it,adj,node)==true){
                    return true;
                }
               

            }
            else if(it!=par) return true;
        }

        return false;
    }
}