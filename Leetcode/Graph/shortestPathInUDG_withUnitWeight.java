class solution{
    public int[] shortesDistance(ArrayList<ArrayList<Integer>> adj, int n,int src){
        int[] dist= new int[n];
        for(int i=0;i<n;i++){
            dist[i]=Integer.MAX_VALUE;
        }

        Queue<Integer> q=new LinkedList<>();

        dist[src]=0;
        q.add(src);

        while(!q.isEmpty()){
            int node=q.poll();
            for(int it: adj.get(node)){
                if(dist[node]+1<dist[it]){
                    dist[it]=dist[node]+1;
                    q.add(it);
                }
            }
        }

        return dist;


    }
}