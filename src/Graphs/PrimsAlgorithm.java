package Graphs;
import java.util.*;
public class PrimsAlgorithm {
    static class Edge {
        int node, weight;

        Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    static class Pair {
        int node, weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public static int primMST(List<List<Edge>> graph, int n) {
        boolean[] visited = new boolean[n];
        // Min Heap based on weight
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.weight));

        // Start from node 0
        pq.add(new Pair(0, 0));
        int mstWeight = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int node = curr.node;
            if (visited[node]) continue;
            visited[node] = true;
            mstWeight += curr.weight;
            // Explore neighbors
            for (Edge edge : graph.get(node)) {
                if (!visited[edge.node]) {
                    pq.add(new Pair(edge.node, edge.weight));
                }
            }
        }
        return mstWeight;
    }

    public static void main(String[] args) {
        int n = 5;

        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Undirected graph
        addEdge(graph, 0, 1, 2);
        addEdge(graph, 0, 3, 6);
        addEdge(graph, 1, 2, 3);
        addEdge(graph, 1, 3, 8);
        addEdge(graph, 1, 4, 5);
        addEdge(graph, 2, 4, 7);
        addEdge(graph, 3, 4, 9);

        int result = primMST(graph, n);
        System.out.println("MST Weight: " + result);
    }
    static void addEdge(List<List<Edge>> graph, int u, int v, int w) {
        graph.get(u).add(new Edge(v, w));
        graph.get(v).add(new Edge(u, w));
    }
}

/*
package Graphs;
import java.util.*;
public class Main {
    static class Edge {
        int node, weight;
        Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    static class Pair {
        int node, weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
    public static int primMST(List<List<Edge>> graph, int n) {
        boolean[] visited = new boolean[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.weight));
        // start from node 0
        pq.add(new Pair(0, 0));
        int mstWeight = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int node = curr.node;
            if (visited[node]) continue;
            visited[node] = true;
            mstWeight += curr.weight;
            for (Edge edge : graph.get(node)) {
                if (!visited[edge.node]) {
                    pq.add(new Pair(edge.node, edge.weight));
                }
            }
        }
        return mstWeight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int e = sc.nextInt();

        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Input edges
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w)); // undirected graph
        }

        int result = primMST(graph, n);
        System.out.println(result);
    }
}
 */