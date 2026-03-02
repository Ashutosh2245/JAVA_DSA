package Graphs;
import java.util.*;
public class CycleDetectionBFSGfg {
    static class Pair {
        int node;
        int parent;
        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    public static boolean bfs(int[][] adj, boolean[] visited, int start) {
        int n = adj.length;
        Queue<Pair> q = new LinkedList<>();
        visited[start] = true;
        q.add(new Pair(start, -1));

        while (!q.isEmpty()) {
            Pair front = q.remove();
            for (int i = 0; i < n; i++) {
                if (adj[front.node][i] == 1) {
                    if (!visited[i]) {
                        visited[i] = true;
                        q.add(new Pair(i, front.node));
                    }
                    else if (i != front.parent) {
                        return true; // Cycle found
                    }
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
                if (bfs(adj, visited, i))
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