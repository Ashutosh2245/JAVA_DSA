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
    public static int networkDelayTime(int[][] times, int n, int src) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for(int i=0;i<=n;i++) adj.add(new ArrayList<Pair>());

        for(int[] edge : times) {
            int u = edge[0], v = edge[1], time = edge[2];
            adj.get(u).add(new Pair(v,time));
        }

        int[] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.time - b.time);
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()) {
            Pair curr = pq.poll();
            int node = curr.node, time = curr.time;
            for(Pair p : adj.get(node)) {
                int totalTime = curr.time + p.time;
                if(totalTime < dist[p.node]) {
                    dist[p.node] = totalTime;
                    pq.add(new Pair(p.node, totalTime));
                }
            }
        }
        int ans = 0;
        for(int i = 1;i <= n;i++) {
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
