package Backtracking;
import java.util.*;
public class RatInaMaze4Directions {
    public static ArrayList<String> ratInMaze(int[][] maze) {
        int n = maze.length;
        ArrayList<String> ans = new ArrayList<>();
        if (maze[0][0] == 0) return ans;
        boolean[][] vis = new boolean[n][n];
        solveMaze(ans, 0, 0, maze, n, "", vis);

        return ans;
    }

    public static void solveMaze(ArrayList<String> ans, int r, int c,
                                 int[][] m, int n, String path, boolean[][] vis) {

        if (r < 0 || c < 0 || r >= n || c >= n || vis[r][c] || m[r][c] == 0) {
            return;
        }
        if (r == n - 1 && c == n - 1) {
            ans.add(path);
            return;
        }
        vis[r][c] = true;
        solveMaze(ans, r + 1, c, m, n, path + "D", vis);
        solveMaze(ans, r, c - 1, m, n, path + "L", vis);
        solveMaze(ans, r, c + 1, m, n, path + "R", vis);
        solveMaze(ans, r - 1, c, m, n, path + "U", vis);

        vis[r][c] = false;
    }
    public static void main(String[] args) {
        int[][] maze = {{1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {1, 1, 0, 0},
                        {0, 1, 1, 1}};
        ArrayList <String> ans = ratInMaze(maze);
        if(ans.isEmpty()) {
            System.out.println("No path found");
        } else {
            System.out.println(ans);
        }
    }
}