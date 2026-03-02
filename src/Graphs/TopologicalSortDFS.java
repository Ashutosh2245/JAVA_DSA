package Graphs;
import java.util.*;
public class TopologicalSortDFS {
    public static ArrayList<Integer> topoSortDFS(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build graph
        for(int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
        }

        boolean[] visited = new boolean[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(i, adj, visited, st);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while(!st.isEmpty()) {
            ans.add(st.pop());
        }

        return ans;
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adj,
                            boolean[] visited, Stack<Integer> st) {

        visited[node] = true;

        for(int ele : adj.get(node)) {
            if(!visited[ele]) {
                dfs(ele, adj, visited, st);
            }
        }

        st.push(node);
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] edges = {
                {3,0},
                {1,0},
                {2,0}
        };
        ArrayList<Integer> result = topoSortDFS(n, edges);
        System.out.println("Topological Sort (DFS):");
        for(int node : result) {
            System.out.print(node + " ");
        }
    }
}