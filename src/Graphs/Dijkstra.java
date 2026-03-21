package Graphs;
import java.util.*;
public class Dijkstra{
    public static class Pair {
        int node, weight;
        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
    public static void dijkstra(int V, ArrayList<ArrayList<Pair>> adj, int src, int dest) {
        int[] dist = new int[V];
        int[] parent = new int[V]; // To store path
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        dist[src] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.weight - b.weight);
        pq.add(new Pair(src, 0));
        while(!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.node;
            for(Pair it : adj.get(u)) {
                int v = it.node;
                int w = it.weight;
                if(dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    parent[v] = u;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }

        // Print shortest distance
        System.out.println("Shortest distance from " + src + " to " + dest + " = " + dist[dest]);

        // Reconstruct path
        List<Integer> path = new ArrayList<>();
        for(int v = dest; v != -1; v = parent[v]) {
            path.add(v);
        }
        Collections.reverse(path);

        System.out.print("Path: ");
        for(int node : path) System.out.print(node + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter edges: ");
        int E = sc.nextInt();

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());

        System.out.println("Enter edges (u v weight):");
        for(int i=0;i<E;i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            adj.get(u).add(new Pair(v,w));
            //adj.get(v).add(new Pair(u,w)); // if undirected
        }

        System.out.print("Enter source node: ");
        int src = sc.nextInt();
        System.out.print("Enter destination node: ");
        int dest = sc.nextInt();

        dijkstra(V, adj, src, dest);
    }
}