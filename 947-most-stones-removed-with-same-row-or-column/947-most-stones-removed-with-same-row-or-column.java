class Solution {
    class UnionFind {
        private int count = 0;
        private int[] parent, rank;
        
        public UnionFind(int n) {
            count = 0;
            int len=n;
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }
        
        public int find(int p) {
        	while (p != parent[p]) {
                parent[p] = parent[parent[p]];    // path compression by halving
                p = parent[p];
            }
            return p;
        }
        
        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) return;
            if (rank[rootQ] > rank[rootP]) {
                parent[rootP] = rootQ;
            }
            else {
                parent[rootQ] = rootP;
                if (rank[rootP] == rank[rootQ]) {
                    rank[rootP]++;
                }
            }
            
        }
        
        public int count(int n) {
            for(int i=0;i<n;i++){
                if(parent[i]==i) count++;
            }
            return n-count;
            
        }
    }
    
    public int removeStones(int[][] M) {
        int n = M.length;
        UnionFind uf = new UnionFind(n);
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(M[i][0]==M[j][0] || M[i][1]==M[j][1]){
                    uf.union(i,j);
                }
            }
        }
        return uf.count(n);
    }

}