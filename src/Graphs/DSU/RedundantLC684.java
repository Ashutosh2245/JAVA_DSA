package Graphs.DSU;
import java.util.*;
public class RedundantLC684 {

    // DSU Class
    static class DSU {
        int[] parent;

        DSU(int n) {
            parent = new int[n + 1]; // 1-based indexing
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]); // path compression
            }
            return parent[x];
        }

        boolean union(int a, int b) {
            int pa = find(a);
            int pb = find(b);

            if (pa == pb) return false; // cycle

            parent[pa] = pb;
            return true;
        }
    }

    // Function (same as LeetCode)
    public static int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        DSU dsu = new DSU(n);

        for (int[] e : edges) {
            if (!dsu.union(e[0], e[1])) {
                return e;
            }
        }

        return new int[0];
    }

    // MAIN FUNCTION
    public static void main(String[] args) {

        int[][] edges = {
                {1,2},
                {1,3},
                {2,3}
        };

        int[] ans = findRedundantConnection(edges);

        System.out.println("Redundant Edge: " + Arrays.toString(ans));
    }
}