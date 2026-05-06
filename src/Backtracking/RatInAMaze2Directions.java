package Backtracking;
import java.util.*;
public class RatInAMaze2Directions {
    public static ArrayList<String> ratInMaze(int[][] maze) {
        int n = maze.length;
        ArrayList<String> ans = new ArrayList<>();
        if (maze[0][0] == 0) return ans;
        solveMaze(ans, 0, 0, maze, n, "");
        return ans;
    }

    public static void solveMaze(ArrayList<String> ans, int r, int c,
                                 int[][] m, int n, String path) {

        if (r >= n || c >= n || m[r][c] == 0) {
            return;
        }
        if (r == n - 1 && c == n - 1) {
            ans.add(path);
            return;
        }
        solveMaze(ans, r + 1, c, m, n, path + "D");
        solveMaze(ans, r, c + 1, m, n, path + "R");
    }
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        ArrayList<String> ans = ratInMaze(maze);
        if(ans.isEmpty()) {
            System.out.println("No path found");
        } else {
            System.out.println(ans);
        }
    }
}