package Graphs;
import java.util.*;
public class BipartiteGraphLC785 {
    public static boolean bfs(int start, int[][] graph, int[] visited) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = 0;   // 0 = Blue, 1 = Red
        q.add(start);
        while (!q.isEmpty()) {
            int front = q.poll();
            int color = visited[front];   // store current node color
            for (int ele : graph[front]) {

                // If not visited
                if (visited[ele] == -1) {
                    visited[ele] = 1 - color;
                    q.add(ele);
                }
                // If same color → Not Bipartite
                else if (visited[ele] == color) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] visited = new int[n];
        Arrays.fill(visited, -1);
        for (int i = 0; i < n; i++) {
            if (visited[i] == -1) {
                if (!bfs(i, graph, visited))
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] adj = {
                {0,1,0,1},
                {1,0,1,0},
                {0,1,0,1},
                {1,0,1,0}
        };
        System.out.println("Is Bipartite?: " + isBipartite(adj));
    }
}


// Method 2

/*
package Graphs;
import java.util.*;
public class BipartiteGraphLC785 {
    static boolean ans;
    public static void bfs(int i, int[][] adj, int[] visited){
        Queue <Integer> q = new LinkedList<>();
        visited[i] = 0; // 1 -> Red & 0 means blue.
        q.add(i);
        while(!q.isEmpty()){
            int front = q.poll();
            int color = visited[front];
            for(int ele : adj[front]){
                if(visited[ele] == visited[front]){
                    ans = false;
                    return;
                }
                if(visited[ele] == -1){
                    visited[ele] = 1-color;
                    q.add(ele);
                }
            }
        }
    }
    public static boolean isBipartite(int[][] adj) {
        ans = true;
        int n = adj.length;
        int[] visited = new int[n];
        Arrays.fill(visited, -1);
        for(int i = 0; i < n; i++){
            if(ans == false) return false;
            if(visited[i] == -1) bfs(i, adj, visited);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] adj = {
                {0,1,0,1},
                {1,0,1,0},
                {0,1,0,1},
                {1,0,1,0}
        };
        System.out.println("Is Bipartite?: " + isBipartite(adj));
    }
}
 */