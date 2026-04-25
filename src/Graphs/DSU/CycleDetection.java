package Graphs.DSU;
import java.util.*;

class DSU {
    int[] parent, size;

    public DSU(int n) {
        parent = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
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

        if (size[pa] < size[pb]) {
            parent[pa] = pb;
            size[pb] += size[pa];
        } else {
            parent[pb] = pa;
            size[pa] += size[pb];
        }
        return true;
    }
}

public class CycleDetection {

    // 🔥 Separate function
    public static boolean hasCycle(int n, int[][] edges) {
        DSU dsu = new DSU(n);

        for (int[] e : edges) {
            if (!dsu.union(e[0], e[1])) {
                return true; // cycle found
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int n = 5;
        int[][] edges = {
                {0,1},{1,2},{2,3},{3,4},{4,1}
        };

        boolean ans = hasCycle(n, edges);

        System.out.println("Cycle present: " + ans);
    }
}