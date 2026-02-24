package Graphs;
import java.util.*;
public class NoOfProvincesBFSLC547 {
    public static void bfs(int[][] adj, boolean[] visited, int start){
        int n = adj.length;
        Queue <Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);
        while (!q.isEmpty()){
            int front = q.remove();
            for (int i = 0; i < n; i++) {
                if(adj[front][i] == 1 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static int findCircleNum(int[][] adj){
        int n = adj.length;
        int count = 0;
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(!vis[i]){
                bfs(adj, vis, i);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] adj = {
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };
        int count = findCircleNum(adj);
        System.out.print("No of provinces: "+count);
    }
}
