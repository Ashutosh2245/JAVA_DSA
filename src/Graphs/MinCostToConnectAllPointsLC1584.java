/*

package Graphs;
import java.util.*;
public class MinCostToConnectAllPointsLC1584{
    public static class Triplet implements Comparable<Triplet> {
        int node, parent, dist;
        Triplet(int node, int parent, int dist) {
            this.node = node;
            this.parent = parent;
            this.dist = dist;
        }
        public int compareTo(Triplet t) {
            return this.dist - t.dist;
        }
    }
    public static int minCostConnectPoints(int[][] points) {
        int n = points.length;
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0, -1, 0));

        boolean[] vis = new boolean[n];
        int sum = 0;

        while (!pq.isEmpty()) {
            Triplet top = pq.poll();
            int node = top.node;
            int dist = top.dist;

            if (vis[node]) continue;

            vis[node] = true;
            sum += dist;

            for (int i = 0; i < n; i++) {
                if (!vis[i]) {
                    int x1 = points[node][0];
                    int y1 = points[node][1];
                    int x2 = points[i][0];
                    int y2 = points[i][1];

                    int mDis = Math.abs(x1 - x2) + Math.abs(y1 - y2);

                    pq.add(new Triplet(i, node, mDis));
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr = {{0,0},{2,2},{3,10},{5,2},{7,0}};
        int minCost = minCostConnectPoints(arr);
        System.out.println("Minimum cost to connect all points: "+minCost);
    }
}

*/

// Method 2

package Graphs;
import java.util.*;
public class MinCostToConnectAllPointsLC1584{
    public static int minCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean[] visited = new boolean[n];
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        int minCost = 0;
        for (int count = 0; count < n; count++) {
            int curr = -1;

            // pick minimum distance unvisited node
            for (int i = 0; i < n; i++) {
                if (!visited[i] && (curr == -1 || dist[i] < dist[curr])) {
                    curr = i;
                }
            }
            visited[curr] = true;
            minCost += dist[curr];
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    int d = Math.abs(points[curr][0] - points[i][0]) +
                            Math.abs(points[curr][1] - points[i][1]);

                    dist[i] = Math.min(dist[i], d);
                }
            }
        }
        return minCost;
    }
    public static void main(String[] args) {
        int[][] arr = {{0,0},{2,2},{3,10},{5,2},{7,0}};
        int minCost = minCostConnectPoints(arr);
        System.out.println("Minimum cost to connect all points: "+minCost);
    }
}