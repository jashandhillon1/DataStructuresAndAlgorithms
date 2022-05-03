class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor) return image;
        else{
            traverse(image,sr,sc,newColor,image[sr][sc]);
        }
        return image;
        
        
    }
    public void traverse(int[][] image,int i,int j,int color,int firstcolor){
        if(i<0 || i>=image.length || j<0 || j>=image[0].length || image[i][j]!=firstcolor){
            return;
        }
        image[i][j]=color;
        traverse(image,i+1,j,color,firstcolor);
        traverse(image,i,j+1,color,firstcolor);
        traverse(image,i-1,j,color,firstcolor);
        traverse(image,i,j-1,color,firstcolor);



        
    }
}