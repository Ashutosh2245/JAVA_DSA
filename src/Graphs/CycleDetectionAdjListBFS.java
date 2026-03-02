package Graphs;
import java.util.*;

public class CycleDetectionAdjListBFS {
    static class Pair {
        int node;
        int parent;

        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }
    public static boolean isCycle(int V, int[][] edges) {

        // Create adjacency list
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
                if (bfs(i, adj, visited))
                    return true;
            }
        }

        return false;
    }
    private static boolean bfs(int start, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start, -1));
        visited[start] = true;

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            for (int neighbor : adj.get(curr.node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(new Pair(neighbor, curr.node));
                }
                else if (neighbor != curr.parent) {
                    return true; // Cycle found
                }
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
        System.out.println("Cycle Present (BFS): " + isCycle(V, edges));
    }
}