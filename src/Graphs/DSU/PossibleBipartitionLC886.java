package Graphs.DSU;
public class PossibleBipartitionLC886 {
    static int[] parent, rank, parity;

    public static void main(String[] args) {
        int n = 4;
        int[][] dislikes = {
                {1, 2},
                {1, 3},
                {2, 4}
        };

        System.out.println(possibleBipartition(n, dislikes)); // true

        int n2 = 3;
        int[][] dislikes2 = {
                {1, 2},
                {1, 3},
                {2, 3}
        };

        System.out.println(possibleBipartition(n2, dislikes2)); // false
    }

    public static boolean possibleBipartition(int n, int[][] dislikes) {
        parent = new int[n + 1];
        rank = new int[n + 1];
        parity = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            parity[i] = 0;
        }

        for (int[] d : dislikes) {
            if (!union(d[0], d[1])) return false;
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
