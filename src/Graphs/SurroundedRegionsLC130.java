package Graphs;
import java.util.*;
public class SurroundedRegionsLC130 {
    static class Pair {
        int r, c;
        Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    public static void solve(char[][] board) {

        int m = board.length;
        int n = board[0].length;

        Queue<Pair> q = new LinkedList<>();
        // Add border O's
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==m-1 || j==n-1){
                    if(board[i][j]=='O'){
                        q.add(new Pair(i,j));
                        board[i][j]='#';
                    }
                }
            }
        }

        int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            Pair curr=q.poll();
            for(int[] d:dirs){
                int nr=curr.r+d[0];
                int nc=curr.c+d[1];
                if(nr>=0 && nc>=0 && nr<m && nc<n && board[nr][nc]=='O'){
                    board[nr][nc]='#';
                    q.add(new Pair(nr,nc));
                }
            }
        }
        // Final conversion
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O') board[i][j]='X';
                else if(board[i][j]=='#') board[i][j]='O';
            }
        }
    }
    public static void main(String[] args) {
        char[][] board = {
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };
        System.out.println("Original Board:");
        for(char[] row : board)
            System.out.println(Arrays.toString(row));
        solve(board);
        System.out.println("\nBoard After Capturing Surrounded Regions:");
        for(char[] row : board)
            System.out.println(Arrays.toString(row));

        System.out.println("\nAll surrounded regions converted successfully.");
    }
}
