class Solution {
    class UnionFind{
        int[] parent, rank;
        public UnionFind(int n){
            parent=new int[n];
            rank=new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
            }
        }
        
        public int find(int p){
            while(p!=parent[p]){
                parent[p]=parent[parent[p]];
                p=parent[p];
            }
            
            return p;
        }
        
        
        public boolean union(int p, int q){
            int rootP=find(p);
            int rootQ=find(q);
            if(rootP==rootQ) return false;
            if(rank[rootQ]>rank[rootP]){
                parent[rootP]=parent[rootQ];
            }else if(rank[rootP]>rank[rootQ]){
                parent[rootQ]=parent[rootP];
            } else{
                parent[rootQ] = rootP;
                rank[rootP]++;
            }
            return true;
        }
    }
    
    
    
    
    int Max_edge=1000;
    public int[] findRedundantConnection(int[][] edges) {
        
        UnionFind uf=new UnionFind(Max_edge+1);
        for(int[] edge:edges){
            if(!uf.union(edge[0],edge[1])) return edge;
        }
        throw new AssertionError();
        
    }
}