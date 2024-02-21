class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int row=grid.length;
        int col=grid[0].length;
        int [][]visited=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1' && visited[i][j]==0){
                    count++;
                    dfs(grid,i,j,visited);
                }
            }
        }
        return count;
    }

    private void dfs(char[][]grid,int row,int col,int visited[][]){
        //base case:
        final int ROW=grid.length;
        final int COLUMN=grid[0].length;
        if((row<0||col<0) || (row==ROW||col==COLUMN)||(visited[row][col]==1)||(grid[row][col]=='0')){
            return ;
        }
       
        //marking visited
        visited[row][col]=1;
        
        dfs(grid,row+1,col,visited);
        dfs(grid,row-1,col,visited);
        dfs(grid,row,col+1,visited);
        dfs(grid,row,col-1,visited);
        return;
        
        
    }
}