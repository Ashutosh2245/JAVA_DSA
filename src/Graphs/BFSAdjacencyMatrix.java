package Graphs;
import java.util.*;
public class BFSAdjacencyMatrix {
    public static void bfs(int[][] adj, boolean[] visited, int start){
        int n = adj.length;
        Queue <Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);
        while (!q.isEmpty()){
            int front = q.remove();
            System.out.print(front + " ");
            for (int i = 0; i < n; i++) {
                if(adj[front][i] == 1 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] adj = {
                {0,1,1,0},
                {1,0,0,1},
                {1,0,0,0},
                {0,1,0,0}
        };
        int n = adj.length;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                bfs(adj, visited, i);
            }
        }
    }
}
