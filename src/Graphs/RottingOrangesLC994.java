package Graphs;
import java.util.*;
public class RottingOrangesLC994 {
    public static int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                if(grid[i][j] == 2)
                    q.add(new int[]{i, j});
                if(grid[i][j] == 1)
                    fresh++;
            }
        }
        if(fresh == 0) return 0;
        int minutes = 0;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()) {
            int size = q.size();
            boolean rottedThisMinute = false;
            for(int i = 0; i < size; i++) {
                int[] cell = q.poll();
                int r = cell[0], c = cell[1];
                for(int[] d : dir) {
                    int nr = r + d[0],  nc = c + d[1];

                    if(nr >= 0 && nc >= 0 &&
                            nr < m && nc < n &&
                            grid[nr][nc] == 1) {

                        grid[nr][nc] = 2;
                        q.add(new int[]{nr, nc});
                        fresh--;
                        rottedThisMinute = true;
                    }
                }
            }
            if(rottedThisMinute) minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        int ans = orangesRotting(grid);
        System.out.println("Minimum minutes: "+ans);
    }
}