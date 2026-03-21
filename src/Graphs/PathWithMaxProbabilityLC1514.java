package Graphs;
import java.util.*;
public class PathWithMaxProbabilityLC1514  {
    public static class Pair {
        int node;
        double prob;
        Pair(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }
    }
    public static double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int i=0;i<edges.length;i++) {
            int u = edges[i][0], v = edges[i][1];
            double p = succProb[i];
            adj.get(u).add(new Pair(v,p));
            adj.get(v).add(new Pair(u,p));
        }
        double[] prob = new double[n];
        prob[start] = 1.0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Double.compare(b.prob, a.prob));
        pq.add(new Pair(start,1.0));
        while(!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.node;
            double currProb = curr.prob;
            if(u == end) return currProb;

            for(Pair it : adj.get(u)) {
                int v = it.node;
                double nextProb = it.prob;

                if(currProb * nextProb > prob[v]) {
                    prob[v] = currProb * nextProb;
                    pq.add(new Pair(v, prob[v]));
                }
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0,1},{1,2},{0,2}};
        double[] succProb = {0.5,0.5,0.2};
        int start = 0, end = 2;
        double ans = maxProbability(n, edges, succProb, start, end);
        System.out.println("Max Probability: "+ans);
    }
}

