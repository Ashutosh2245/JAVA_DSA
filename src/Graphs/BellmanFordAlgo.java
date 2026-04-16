package Graphs;
import java.util.*;
public class BellmanFordAlgo {
    public static int[] bellmanFord(int V, int[][] edges, int src) {
        int[] dist = new int[V];

        // Step 1: Initialize
        Arrays.fill(dist, (int)1e8);
        dist[src] = 0;

        // Step 2: Relax edges V-1 times
        for (int i = 0; i < V - 1; i++) {
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];

                if (dist[u] != (int)1e8 && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                }
            }
        }

        // Step 3: Check negative cycle
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            if (dist[u] != (int)1e8 && dist[u] + w < dist[v]) {
                return new int[]{-1};
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        int v = 5;
        int[][] edges = {{1, 3, 2}, {4, 3, -1}, {2, 4, 1}, {1, 2, 1}, {0, 1, 5}};
        int src = 0;
        int[] ans = bellmanFord(v, edges, src);
        System.out.println("Shortest Paths from source node to all nodes: \n" +Arrays.toString(ans));
    }
}