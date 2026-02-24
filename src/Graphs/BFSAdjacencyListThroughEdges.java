// 0 Based indexing

package Graphs;
import java.util.*;
public class BFSAdjacencyListThroughEdges {
    int v;
    ArrayList <ArrayList <Integer>> adj;
    BFSAdjacencyListThroughEdges(int v){
        this.v = v;
        adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }
    void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    void bfs(boolean[] visited, int start){
        Queue <Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);
        while (!q.isEmpty()){
            int front = q.remove();
            System.out.print(front+ " ");

            for(int ele : adj.get(front)){
                if(!visited[ele]){
                    visited[ele] = true;
                    q.add(ele);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();
        BFSAdjacencyListThroughEdges g = new BFSAdjacencyListThroughEdges(V);
        System.out.println("Enter edges (u v): ");
        for(int i = 0; i < E; i++){
            int u = sc.nextInt() ;
            int v = sc.nextInt() ;
            g.addEdge(u, v);
        }
        boolean[] visited = new boolean[V];
        System.out.print("BFS Traversal: ");
        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                g.bfs(visited, i);
            }
        }
    }
}
