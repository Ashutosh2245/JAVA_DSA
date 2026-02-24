package Graphs;
public class DFSAdjMatrix {

    public static void dfs(int[][] adj, boolean[] visited, int start) {

        visited[start] = true;
        System.out.print(start + " ");

        int n = adj.length;

        for (int i = 0; i < n; i++) {
            if (adj[start][i] == 1 && !visited[i]) {
                dfs(adj, visited, i);
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
                dfs(adj, visited, i);
            }
        }
    }
}