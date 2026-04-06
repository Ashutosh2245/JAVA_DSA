package Graphs;
import java.util.*;
class Kruskal {

    static class Edge {
        int u, v, weight;

        Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }

    // Disjoint Set Union (Union-Find)
    static class DSU {
        int[] parent, rank;

        DSU(int n) {
            parent = new int[n];
            rank = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]); // path compression
            }
            return parent[x];
        }

        void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX != rootY) {
                if (rank[rootX] < rank[rootY]) {
                    parent[rootX] = rootY;
                } else if (rank[rootX] > rank[rootY]) {
                    parent[rootY] = rootX;
                } else {
                    parent[rootY] = rootX;
                    rank[rootX]++;
                }
            }
        }
    }

    public static int kruskalMST(List<Edge> edges, int n) {

        // Min Heap based on edge weight
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));

        // Add all edges to heap
        for (Edge e : edges) {
            pq.add(e);
        }

        DSU dsu = new DSU(n);
        int mstWeight = 0;

        while (!pq.isEmpty()) {
            Edge edge = pq.poll();

            int uRoot = dsu.find(edge.u);
            int vRoot = dsu.find(edge.v);

            // If no cycle
            if (uRoot != vRoot) {
                mstWeight += edge.weight;
                dsu.union(uRoot, vRoot);
            }
        }

        return mstWeight;
    }

    public static void main(String[] args) {
        int n = 5;

        List<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 2));
        edges.add(new Edge(0, 3, 6));
        edges.add(new Edge(1, 2, 3));
        edges.add(new Edge(1, 3, 8));
        edges.add(new Edge(1, 4, 5));
        edges.add(new Edge(2, 4, 7));
        edges.add(new Edge(3, 4, 9));

        int result = kruskalMST(edges, n);
        System.out.println("MST Weight: " + result);
    }
}
