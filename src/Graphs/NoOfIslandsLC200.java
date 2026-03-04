// Method 1 -- >> BFS
package Graphs;
import java.util.*;
public class NoOfIslandsLC200 {
    public static class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public static int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    bfs(i,j,grid,visited);
                    count++;
                }
            }
        }
        return count;
    }
    private static void bfs(int i, int j, char[][] grid, boolean[][] visited){
        int m = grid.length, n = grid[0].length;
        Queue <Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        visited[i][j] = true;
        while (!q.isEmpty()){
            Pair front = q.remove();
            int row = front.row, col = front.col;
            // top -> row-1, col
            if(row > 0){
                if(visited[row - 1][col] == false && grid[row-1][col] == '1'){
                    q.add(new Pair(row-1, col));
                    visited[row - 1][col] = true;
                }
            }
            // bottom -> row+1, col
            if((row + 1) < m){
                if(visited[row + 1][col] == false && grid[row+1][col] == '1'){
                    q.add(new Pair(row+1, col));
                    visited[row + 1][col] = true;
                }
            }
            // left -> row, col-1
            if(col > 0){
                if(visited[row][col-1] == false && grid[row][col-1] == '1'){
                    q.add(new Pair(row, col-1));
                    visited[row][col-1] = true;
                }
            }
            // right -> row, col+1
            if((col+1) < n){
                if(visited[row][col+1] == false && grid[row][col+1] == '1'){
                    q.add(new Pair(row, col+1));
                    visited[row][col+1] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        int ans = numIslands(grid);
        System.out.println("No of islands: "+ans);
    }
}


// Method 2 -- >> DFS

/*package Graphs;
public class NoOfIslandsLC200 {
    public static int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    dfs(i, j, grid, visited);
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfs(int row, int col, char[][] grid, boolean[][] visited) {

        int m = grid.length;
        int n = grid[0].length;

        if(row < 0 || col < 0 || row >= m || col >= n ||
                grid[row][col] == '0' || visited[row][col]) {
            return;
        }

        visited[row][col] = true;
        dfs(row-1, col, grid, visited); // top
        dfs(row+1, col, grid, visited); // bottom
        dfs(row, col-1, grid, visited); // left
        dfs(row, col+1, grid, visited); // right
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        int ans = numIslands(grid);
        System.out.println("No of islands: "+ans);
    }
}

*/
