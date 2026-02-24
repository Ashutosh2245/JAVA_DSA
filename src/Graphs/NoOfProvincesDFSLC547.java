package Graphs;
public class NoOfProvincesDFSLC547 {
    public static void dfs(int[][] adj, boolean[] visited, int start){
        int n = adj.length;
        visited[start] = true;
        for (int i = 0; i < n; i++) {
            if (adj[start][i] == 1 && !visited[i]) {
                dfs(adj, visited, i);
            }
        }
    }
    public static int findCircleNum(int[][] adj){
        int n = adj.length;
        int count = 0;
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(!vis[i]){
                dfs(adj, vis, i);
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
