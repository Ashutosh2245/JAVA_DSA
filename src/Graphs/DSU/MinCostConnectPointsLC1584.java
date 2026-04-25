package Graphs.DSU;
import java.util.*;
public class MinCostConnectPointsLC1584 {

    // DSU Class
    static class DSU {
        int[] parent, size;

        DSU(int n) {
            parent = new int[n];
            size = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
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

    // Edge class
    static class Edge {
        int u, v, wt;

        Edge(int u, int v, int wt) {
            this.u = u;
            this.v = v;
            this.wt = wt;
        }
    }

    // Same LeetCode function
    public static int minCostConnectPoints(int[][] points) {

        int n = points.length;
        List<Edge> edges = new ArrayList<>();

        // build all edges
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dist = Math.abs(points[i][0] - points[j][0]) +
                        Math.abs(points[i][1] - points[j][1]);
                edges.add(new Edge(i, j, dist));
            }
        }

        // sort edges
        edges.sort(Comparator.comparingInt(e -> e.wt));

        DSU dsu = new DSU(n);

        int cost = 0;
        int edgesUsed = 0;

        for (Edge e : edges) {
            if (dsu.union(e.u, e.v)) {
                cost += e.wt;
                edgesUsed++;

                if (edgesUsed == n - 1) break;
            }
        }

        return cost;
    }

    // MAIN FUNCTION
    public static void main(String[] args) {

        int[][] points = {
                {0,0},{2,2},{3,10},{5,2},{7,0}
        };

        int ans = minCostConnectPoints(points);

        System.out.println("Minimum Cost: " + ans);
    }
}