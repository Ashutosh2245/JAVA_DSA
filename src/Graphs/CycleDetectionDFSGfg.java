package Graphs;
public class CycleDetectionDFSGfg {

    public static boolean dfs(int[][] adj, boolean[] visited, int node, int parent) {
        visited[node] = true;
        int n = adj.length;
        for (int i = 0; i < n; i++) {
            if (adj[node][i] == 1) {
                if (!visited[i]) {
                    if (dfs(adj, visited, i, node))
                        return true;
                }
                else if (i != parent) {
                    return true; // Cycle found
                }
            }
        }
        return false;
    }

    public static boolean isCycle(int[][] adj) {
        int n = adj.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (dfs(adj, visited, i, -1))
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] adj = {
                {0,1,0,1},
                {1,0,1,0},
                {0,1,0,1},
                {1,0,1,0}
        };
        System.out.println("Cycle Present: " + isCycle(adj));
    }
}