// Method 1 -- >> BFS

/*
package Graphs;
import java.util.*;
public class FindIfPathExistsLC1971 {
    public static boolean validPath(int n, int[][] edges, int start, int end) {
        if(start == end) return true;
        ArrayList <ArrayList <Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++){
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        boolean[] visited = new boolean[n];
        visited[start] = true;
        bfs(start, adj, visited, end);
        return visited[end];
    }
    private static void bfs(int start, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int end){
        Queue <Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int front = q.poll();
            for(int ele : adj.get(front)){
                if(!visited[ele]){
                    q.add(ele);
                    visited[ele] = true;
                    if(ele == end) return;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {{0,1},{0,2},{3,5},{5,4},{4,3}};
        int start = 0;
        int end = 5;
        boolean ans = validPath(n, edges, start, end);
        System.out.println("Is valid path: "+ans);
    }
}
 */

// Method 2 -->> DFS
package Graphs;
import java.util.*;
public class FindIfPathExistsLC1971 {
    public static boolean validPath(int n, int[][] edges, int start, int end) {
        if(start == end) return true;
        ArrayList <ArrayList <Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++){
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        boolean[] visited = new boolean[n];
        visited[start] = true;
        dfs(start, adj, visited, end);
        return visited[end];
    }

    private static void dfs(int start, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int end){
        visited[start] = true;
        for(int ele : adj.get(start)){
            if(!visited[ele]){
                dfs(ele, adj, visited, end);
                if(ele == end) return;
            }
        }
    }
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {{0,1},{0,2},{3,5},{5,4},{4,3}};
        int start = 0;
        int end = 5;
        boolean ans = validPath(n, edges, start, end);
        System.out.println("Is valid path: "+ans);
    }
}