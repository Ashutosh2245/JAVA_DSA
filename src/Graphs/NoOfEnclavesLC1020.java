package Graphs;
import java.util.*;
public class NoOfEnclavesLC1020 {

    static class Pair {
        int r, c;
        Pair(int r, int c){
            this.r = r;
            this.c = c;
        }
    }

    public static int numEnclaves(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        // Add boundary land
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==m-1 || j==n-1){
                    if(grid[i][j]==1){
                        q.add(new Pair(i,j));
                        grid[i][j]=0;
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

                if(nr>=0 && nc>=0 && nr<m && nc<n && grid[nr][nc]==1){
                    grid[nr][nc]=0;
                    q.add(new Pair(nr,nc));
                }
            }
        }

        int count=0;
        for(int[] row:grid){
            for(int cell:row){
                if(cell==1) count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {0,0,0,0},
                {1,0,1,0},
                {0,1,1,0},
                {0,0,0,0}
        };

        System.out.println("Original Grid:");
        for(int[] row : grid)
            System.out.println(Arrays.toString(row));

        int enclaves = numEnclaves(grid);

        System.out.println("\nNumber of Enclaves: " + enclaves);
        System.out.println("Boundary-connected lands removed successfully using Multi-Source BFS.");
    }
}