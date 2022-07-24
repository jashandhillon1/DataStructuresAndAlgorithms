class solution{
    public int[] TopologicalSort(ArrayList<ArrayList<Integer>> adj, int n){
        Stack<Integer> stack=new Stack<Integer>();
        int vis[]=new int[n];

        for(int i=0;i<=n;i++){
            if(vis[i]==0){
                helper(adj,vis,i,stack);
            }
        }


        int topo[]=new int[n];
        int ind=0;
        while(!stack.isEmpty){
            topo[ind++]=stack.pop();
        }

        return topo;

    }


    public void helper(ArrayList<ArrayList<Integer>> adj, int vis[],int node,Stack stack){
        vis[node]=1;
        for(Integer it: adj.get(node)){
            if(vis[it]!=0){
                helper(adj,vis,it,stack);
            }
        }

        stack.push(node);
    }
}