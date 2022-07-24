//Time and space complexity is O(N)


class Node{
    int first;
    int second;
    public Node(int first,int second){
        this.first=first;
        this.second=second;
    }
}


class solution{
    public boolean iscycle(int v,ArrayList<ArrayList<Integer>> adj){
        boolean vis[]=new boolean[v-1];
        Arrays.fill(vis,false);

        for(int i=1;i<=v;i++){
            if(vis[i]==false){
                if(helper(adj,vis,i)){
                    return true;
                }
            }
        }
        return false;
    }


    public boolean helper(ArrayList<ArrayList<Integer>> adj,boolean[] vis,int s){
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(s,-1));
        vis[s]=true;


        while(!q.isEmpty){
            int node=q.peek().first();
            int par=q.peek().second();
            q.remove();

            for(Integer it: adj.get(node)){
                if(vis[it]==false){
                    q.add(new Node(it,node));
                    vis[it]=true;

                }

                else if(par!=it) return true;
            }
        }
        return false;
    }
}