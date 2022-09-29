class Solution {
    public int maxDistance(int[][] grid) {
        int dist=1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    grid[i][j]=0;
                    
                    dfs(grid,i,j,dist);
                }
            }
        }
        int max=-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[1].length;j++){
                if(grid[i][j]>1){
                    max=Math.max(grid[i][j]-1,max);
                }
            }
        }
        return max;
    }
    public void dfs(int[][] grid,int i,int j,int dist){
        if(i<0 || i>=grid.length || j<0 || j>=grid[1].length || grid[i][j]!=0  && grid[i][j]<=dist ){
            return;
        }
        grid[i][j]=dist;
        dfs(grid,i+1,j,dist+1);
        dfs(grid,i-1,j,dist+1);
        dfs(grid,i,j+1,dist+1);
        dfs(grid,i,j-1,dist+1);    
        
    }
}