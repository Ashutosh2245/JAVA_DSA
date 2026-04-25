package Graphs.DSU;
import java.util.*;

// Edge class
class Edges {
    int u, v, wt;

    Edges(int u, int v, int wt) {
        this.u = u;
        this.v = v;
        this.wt = wt;
    }
}

// DSU
class DSU6 {
    int[] parent, size;

    public DSU6(int n) {
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

        if (pa == pb) return false;

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

public class KruskalMST {
    public static int kruskalMST(int n, int[][] inputEdges) {
        List<Edges> edges = new ArrayList<>();
        for (int[] e : inputEdges) {
            edges.add(new Edges(e[0], e[1], e[2]));
        }
        edges.sort(Comparator.comparingInt(e -> e.wt));

        DSU6 dsu = new DSU6(n);

        int mstCost = 0;
        int edgesUsed = 0;

        for (Edges e : edges) {
            if (dsu.union(e.u, e.v)) {
                mstCost += e.wt;
                edgesUsed++;

                if (edgesUsed == n - 1) break;
            }
        }
        return mstCost;
    }

    public static void main(String[] args) {
        int n = 5;

        int[][] inputEdges = {
                {0,1,2},
                {0,3,6},
                {1,2,3},
                {1,3,8},
                {1,4,5},
                {2,4,7},
                {3,4,9}
        };

        int cost = kruskalMST(n, inputEdges);

        System.out.println("MST Cost: " + cost);
    }
}