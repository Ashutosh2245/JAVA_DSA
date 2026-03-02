package Graphs;
import java.util.*;
public class CycleDetectionAdjListDFS {
    public static boolean isCycle(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        // Fill adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u); // undirected
        }

        boolean[] visited = new boolean[V];
        // Check all components
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, adj, visited))
                    return true;
            }
        }

        return false;
    }
    private static boolean dfs(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {

            if (!visited[neighbor]) {
                if (dfs(neighbor, node, adj, visited))
                    return true;
            }
            else if (neighbor != parent) {
                return true; // Cycle found
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int V = 4;
        int[][] edges = {
                {0, 1},
                {0, 2},
                {1, 2},
                {2, 3}
        };
        System.out.println("Cycle Present (DFS): " + isCycle(V, edges));
    }
}