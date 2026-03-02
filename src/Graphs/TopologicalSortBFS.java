package Graphs;
import java.util.*;
public class TopologicalSortBFS {
    public static ArrayList<Integer> topoSortBFS(int n, int[][] edges) {

        // Building adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        int[] inDeg = new int[n];

        // Build graph
        for(int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            inDeg[v]++;
        }

        // Adding vertices with inDegree == 0
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            if(inDeg[i] == 0) {
                q.add(i);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        // BFS
        while(!q.isEmpty()) {
            int node = q.poll();
            ans.add(node);

            for(int ele : adj.get(node)) {
                inDeg[ele]--;
                if(inDeg[ele] == 0) {
                    q.add(ele);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of vertices: ");
        int n = sc.nextInt();
        System.out.print("\nEnter the no of edges: ");
        int m = sc.nextInt();
        int[][] edges = new int[m][2];

        for(int i = 0; i < m; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }

        ArrayList<Integer> result = topoSortBFS(n, edges);
        System.out.println("Topological Sort (BFS):");
        for(int node : result) {
            System.out.print(node + " ");
        }
    }
}