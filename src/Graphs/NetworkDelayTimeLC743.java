package Graphs;
import java.util.*;
public class NetworkDelayTimeLC743 {
    public static class Pair {
        int node, time;
        Pair(int node, int time) {
            this.node = node;
            this.time = time;
        }
    }
    public static int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++) adj.add(new ArrayList<>());

        for(int[] edge : times) {
            int u = edge[0], v = edge[1], w = edge[2];
            adj.get(u).add(new Pair(v,w));
        }
        int[] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.time - b.time);
        pq.add(new Pair(k,0));
        while(!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.node;
            for(Pair it : adj.get(u)) {
                int v = it.node;
                int w = it.time;
                if(dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }
        int ans = 0;
        for(int i=1;i<=n;i++) {
            if(dist[i] == Integer.MAX_VALUE) return -1;
            ans = Math.max(ans, dist[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{2,1,1},{2,3,1},{3,4,1}};
        int n = 4, k = 2;
        int ans = networkDelayTime(arr, n, k);
        System.out.println("Minimum Time: "+ans);
    }
}
