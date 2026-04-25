package Graphs;
import java.util.Scanner;
public class DFSAdjMatrix {

    public static void dfs(int[][] adj, boolean[] visited, int start) {
        visited[start] = true;
        System.out.print(start + " ");

        int n = adj.length;

        for (int i = 0; i < n; i++) {
            if (adj[start][i] == 1 && !visited[i]) {
                dfs(adj, visited, i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int[][] adj = new int[n][n];
        System.out.println("Enter adjacency matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = sc.nextInt();
            }
        }
        boolean[] visited = new boolean[n];
        System.out.println("DFS Traversal:");
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(adj, visited, i);
            }
        }
        sc.close();
    }
}