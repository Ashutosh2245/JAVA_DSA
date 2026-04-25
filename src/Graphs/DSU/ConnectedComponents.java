package Graphs.DSU;
import java.util.*;

class DSU2 {
    int[] parent, size;

    public DSU2(int n) {
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

    public void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);

        if (pa == pb) return;

        if (size[pa] < size[pb]) {
            parent[pa] = pb;
            size[pb] += size[pa];
        } else {
            parent[pb] = pa;
            size[pa] += size[pb];
        }
    }
}

public class ConnectedComponents {
    public static int countComponents(int n, int[][] edges) {
        DSU2 dsu = new DSU2(n);

        for (int[] e : edges) {
            dsu.union(e[0], e[1]);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (dsu.find(i) == i) count++;
        }
        return count;
    }
    public static void main(String[] args) {

        int n = 6;
        int[][] edges = {
                {0,1},{1,2},{3,4}
        };
        int components = countComponents(n, edges);

        System.out.println("Connected Components: " + components);
    }
}