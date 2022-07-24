class solution{
    public boolean bipartitie(ArrayList<ArrayList<Integer>> adj, int n){
        int color[]=new color[n];
        for(int i=0li<n;i++){
            color[i]=-1;
        }

        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(helper(adj,i,color)){
                    retun true;
                }
            }
        }
        return true;        
    }


    public boolean helper(ArrayList<ArrayList<Integer>> adj,int node,int color[]){
        Queue q=new LinkedList<>();
        q.add(node);
        color[node]=1;
        while(!q.isEmpty){
            Integer nde=q.poll();
            for(Integer it:nde){

                if(color[it]!=-1){
                    color[it]=1-color[nde];
                    q.add(it);

            }
            else if(color[node]==color[nde]){
                return true;
            }

            }
            
        }

        return false;
    }
}