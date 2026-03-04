package Graphs;
import java.util.*;
public class LC542_01Matrix {
    static class Pair {
        int r, c;
        Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static int[][] updateMatrix(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        Queue<Pair> q = new LinkedList<>();

        // Add all 0s to queue and mark 1s as -1
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 0) {
                    q.add(new Pair(i, j));
                } else {
                    mat[i][j] = -1;
                }
            }
        }

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()) {
            Pair curr = q.poll();

            for(int[] d : dirs) {
                int nr = curr.r + d[0];
                int nc = curr.c + d[1];

                if(nr>=0 && nc>=0 && nr<m && nc<n && mat[nr][nc]==-1) {
                    mat[nr][nc] = mat[curr.r][curr.c] + 1;
                    q.add(new Pair(nr,nc));
                }
            }
        }

        return mat;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };

        System.out.println("Original Matrix:");
        for(int[] row : grid)
            System.out.println(Arrays.toString(row));

        int[][] result = updateMatrix(grid);

        System.out.println("\nMatrix After Applying Multi-Source BFS:");
        for(int[] row : result)
            System.out.println(Arrays.toString(row));

        System.out.println("\nShortest distance from nearest 0 calculated successfully.");
    }
}