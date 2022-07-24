class solution{
    public int[] TopologicalSort(ArrayList<ArrayList<Integer>> adj, int n){
        int topo[]=new int[n];
        int indegree[]=new int[n];
        for(int i=0;i<=n;i++){
            for(Integer it: adj.get(i)){
                indegree[it]++;
            }
        }


        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        int ind=0;
        while(!q.isEmpty){
            Integer node = q.poll();
            topo[ind++]=node;


            for(Integer it: adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }

        return topo;
    }
}