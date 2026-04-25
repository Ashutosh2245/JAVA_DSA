package Graphs.DSU;
import java.util.*;
public class RedundantConnectionIILC685 {
    static class DSU {
        int[] parent;

        DSU(int n) {
            parent = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        boolean union(int a, int b) {
            int pa = find(a);
            int pb = find(b);

            if (pa == pb) return false;

            parent[pa] = pb;
            return true;
        }
    }

    public static int[] findRedundantDirectedConnection(int[][] edges) {

        int n = edges.length;
        int[] parent = new int[n + 1];

        int[] edge1 = null; // first parent edge
        int[] edge2 = null; // second parent edge

        // Step 1: detect node with 2 parents
        for (int[] e : edges) {
            int u = e[0], v = e[1];

            if (parent[v] == 0) {
                parent[v] = u;
            } else {
                edge1 = new int[]{parent[v], v};
                edge2 = new int[]{u, v};
                e[1] = 0; // invalidate second edge
            }
        }

        // Step 2: DSU to detect cycle
        DSU dsu = new DSU(n);

        for (int[] e : edges) {
            if (e[1] == 0) continue; // skip invalid edge

            if (!dsu.union(e[0], e[1])) {
                // cycle found
                if (edge1 == null) return e; // Case 1
                return edge1; // Case 3
            }
        }

        // Case 2
        return edge2;
    }

    public static void main(String[] args) {

        int[][] edges = {
                {1,2},
                {2,3},
                {3,4},
                {4,1},
                {1,5}
        };

        int[] ans = findRedundantDirectedConnection(edges);

        System.out.println("Redundant Edge: " + Arrays.toString(ans));
    }
}