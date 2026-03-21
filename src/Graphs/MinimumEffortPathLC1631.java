package Graphs;
import java.util.*;
public class MinimumEffortPathLC1631 {
    public static int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        int[][] effort = new int[n][m];
        for (int[] row : effort) Arrays.fill(row, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, 0, 0}); // effort, row, col
        effort[0][0] = 0;

        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int currEff = curr[0];
            int r = curr[1];
            int c = curr[2];

            if (r == n - 1 && c == m - 1) return currEff;

            for (int[] d : dir) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nc >= 0 && nr < n && nc < m) {
                    int diff = Math.abs(heights[r][c] - heights[nr][nc]);
                    int newEff = Math.max(currEff, diff);

                    if (newEff < effort[nr][nc]) {
                        effort[nr][nc] = newEff;
                        pq.offer(new int[]{newEff, nr, nc});
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] heights = {
                {1,2,2},
                {3,8,2},
                {5,3,5}
        };

        System.out.println("Minimum Effort Path: "+minimumEffortPath(heights)); // Output: 2
    }
}
