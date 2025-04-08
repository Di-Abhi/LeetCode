class Solution {
    int rows;
    int cols;
    public void dfs(int row,int col,int newColor,int curColor,int grid[][],boolean visited[][]){
        if(row<0||row>rows-1||col<0||col>cols-1||grid[row][col]!=curColor||visited[row][col]){
            return;
        }
        visited[row][col]=true;
        boolean border=false;
        if(row==0||col==0||col==cols-1||row==rows-1||grid[row+1][col]!=curColor||grid[row-1][col]!=curColor||grid[row][col-1]!=curColor||grid[row][col+1]!=curColor){
            border=true;
        }
        int adjList[][] ={{row-1,col},{row,col-1},{row+1,col},{row,col+1}};
        for(int nab[]:adjList){
            dfs(nab[0],nab[1],newColor,curColor,grid,visited);
        }
        if(border) grid[row][col]=newColor;
    }
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        rows=grid.length;
        cols=grid[0].length;
        if(grid[row][col]==color){
            return grid;
        }
        boolean visited[][] = new boolean[rows][cols];
        dfs(row,col,color,grid[row][col],grid,visited);
        return grid;
    }
}