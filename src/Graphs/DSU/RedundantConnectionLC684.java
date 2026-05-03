package Graphs.DSU;
import java.util.*;

class DSU4 {
    int[] parent;

    public DSU4(int n) {
        parent = new int[n + 1]; // 1-based indexing
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public boolean union(int a, int b) {
        int pa = find(a);
        int pb = find(b);

        if (pa == pb) return false; // cycle

        parent[pa] = pb;
        return true;
    }
}

public class RedundantConnectionLC684 {
    public static void main(String[] args) {

        int[][] edges = {
                {1,2},{1,3},{2,3}
        };

        int n = edges.length;
        DSU4 dsu = new DSU4(n);

        for (int[] e : edges) {
            if (!dsu.union(e[0], e[1])) {
                System.out.println("Redundant Edge: " + Arrays.toString(e));
                break;
            }
        }
    }
}