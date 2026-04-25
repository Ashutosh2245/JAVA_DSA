//import java.util.*;
//class Solution {
//    public static int[][] colorGrid(int n, int m, int[][] sources) {
//        int[][] grid = new int[n][m];
//
//        // Max-heap → higher color spreads first
//        PriorityQueue<int[]> pq = new PriorityQueue<>(
//                (a, b) -> b[2] - a[2]
//        );
//
//        for (int[] s : sources) {
//            int r = s[0], c = s[1], color = s[2];
//            grid[r][c] = color;
//            pq.offer(new int[]{r, c, color});
//        }
//
//        int[] dr = {-1, 1, 0, 0};
//        int[] dc = {0, 0, -1, 1};
//
//        while (!pq.isEmpty()) {
//            int[] curr = pq.poll();
//            int r = curr[0], c = curr[1], color = curr[2];
//
//            for (int d = 0; d < 4; d++) {
//                int nr = r + dr[d];
//                int nc = c + dc[d];
//
//                if (nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 0) {
//                    grid[nr][nc] = color;
//                    pq.offer(new int[]{nr, nc, color});
//                }
//            }
//        }
//        return grid;
//    }
//
//    public static void main(String[] args) {
//        int n = 3, m = 3;
//        int[][] sources = {{0,0,1},{2,2,2}};
//        int[][] ans = colorGrid(n,m,sources);
//        for (int i = 0; i < ans.length; i++) {
//            for (int j = 0; j < ans[0].length; j++) {
//                System.out.print(ans[i][j] + " ");
//            }
//            System.out.println();
//
//        }
//    }
//}

import java.util.*;

class Solution {

    public static long countGoodIntegersOnPath(long l, long r, String directions) {
        // Build path
        List<Integer> path = new ArrayList<>();
        int row = 0, col = 0;
        path.add(0);

        for (char ch : directions.toCharArray()) {
            if (ch == 'D') row++;
            else col++;
            path.add(row * 4 + col);
        }

        int[] onPath = new int[16];
        for (int p : path) onPath[p] = 1;

        return countUpTo(r, onPath) - countUpTo(l - 1, onPath);
    }

    private static long countUpTo(long bound, int[] onPath) {
        if (bound < 0) return 0;

        String s = String.valueOf(bound);
        while (s.length() < 16) s = "0" + s;

        long[][][] memo = new long[17][2][11];
        for (long[][] arr2 : memo)
            for (long[] arr1 : arr2)
                Arrays.fill(arr1, -1);

        return dfs(0, 1, 10, s, onPath, memo);
    }

    private static long dfs(int pos, int tight, int last,
                     String s, int[] onPath, long[][][] memo) {

        if (pos == 16) return 1;

        if (memo[pos][tight][last] != -1)
            return memo[pos][tight][last];

        long res = 0;
        int limit = (tight == 1) ? (s.charAt(pos) - '0') : 9;

        for (int d = 0; d <= limit; d++) {
            int nextTight = (tight == 1 && d == limit) ? 1 : 0;

            if (onPath[pos] == 1) {
                if (last != 10 && d < last) continue;
                res += dfs(pos + 1, nextTight, d, s, onPath, memo);
            } else {
                res += dfs(pos + 1, nextTight, last, s, onPath, memo);
            }
        }

        return memo[pos][tight][last] = res;
    }

    public static void main(String[] args) {
        int l = 8, r = 10;
        String s= "DDDRRR";
        long ans = countGoodIntegersOnPath(l,r,s);
        System.out.println(ans);
    }
}