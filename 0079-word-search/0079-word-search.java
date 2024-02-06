class Solution {
    static boolean visited[][];
    public boolean exist(char[][] board, String word) {
         int row=board.length;
         int column=board[0].length;
         visited=new boolean[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(word.charAt(0)==board[i][j] && search(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
        
        
    }
   boolean search(char[][]board,String word,int i,int j,int index){
        if(index==word.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || word.charAt(index)!=board[i][j] || visited[i][j]){
            return false;
        }
        visited[i][j]=true;
        if(search(board,word,i,j+1,index+1)|| search(board,word,i,j-1,index+1) || search(board,word,i+1,j,index+1)||search(board,word,i-1,j,index+1)){
            return true;
        }
         visited[i][j]=false;
       return false;
    }
}