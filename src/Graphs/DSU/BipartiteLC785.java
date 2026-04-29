package Graphs.DSU;
public class BipartiteLC785 {

    static int[] parent, rank, parity;
    public static void main(String[] args) {
        int[][] graph = {
                {1, 3},
                {0, 2},
                {1, 3},
                {0, 2}
        };

        System.out.println(isBipartite(graph)); // true
    }

    public static boolean isBipartite(int[][] graph) {
        int n = graph.length;

        parent = new int[n];
        rank = new int[n];
        parity = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            parity[i] = 0;
        }
        for (int u = 0; u < n; u++) {
            for (int v : graph[u]) {
                if (!union(u, v)) return false;
            }
        }
        return true;
    }

    static int find(int x) {
        if (parent[x] != x) {
            int orig = parent[x];
            parent[x] = find(parent[x]);
            parity[x] ^= parity[orig];
        }
        return parent[x];
    }

    static boolean union(int u, int v) {
        int pu = find(u);
        int pv = find(v);

        if (pu == pv) {
            return parity[u] != parity[v]; // must be opposite
        }

        if (rank[pu] < rank[pv]) {
            parent[pu] = pv;
            parity[pu] = parity[u] ^ parity[v] ^ 1;
        } else {
            parent[pv] = pu;
            parity[pv] = parity[u] ^ parity[v] ^ 1;
            if (rank[pu] == rank[pv]) rank[pu]++;
        }

        return true;
    }
}