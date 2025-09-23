class Solution {
    private void dfs(int row,int col,int[][] ans,int[][] image,int color,int[] drow,int[] dcol,int inicol){
        ans[row][col]=color;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+drow[i];
            int ncol= col+dcol[i];
            if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&image[nrow][ncol]==inicol&&ans[nrow][ncol]!=color){
                dfs(nrow,ncol,ans,image,color,drow,dcol,inicol);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans = image;
        int inicol=image[sr][sc];
        int[] drow={-1,0,1,0};
        int[] dcol={0,-1,0,1};
        dfs(sr,sc,ans,image,color,drow,dcol,inicol);
        return ans;
    }
}