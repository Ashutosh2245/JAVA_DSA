package Graphs;
import java.util.*;
public class CheapestFlightsLC787 {

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] f : flights) {
            graph.get(f[0]).add(new int[]{f[1], f[2]});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] - b[0]
        );

        pq.offer(new int[]{0, src, 0}); // cost, node, stops

        int[] stopsArr = new int[n];
        Arrays.fill(stopsArr, Integer.MAX_VALUE);

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int cost = curr[0];
            int node = curr[1];
            int stops = curr[2];

            if (node == dst) return cost;

            if (stops > k || stops > stopsArr[node]) continue;

            stopsArr[node] = stops;

            for (int[] nei : graph.get(node)) {
                pq.offer(new int[]{cost + nei[1], nei[0], stops + 1});
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] flights = {
                {0,1,100},
                {1,2,100},
                {2,3,100},
                {0,2,500}
        };

        int src = 0, dst = 3, k = 1;

        System.out.println("Cheapest Price: "+findCheapestPrice(n, flights, src, dst, k)); // Output: 600
    }
}