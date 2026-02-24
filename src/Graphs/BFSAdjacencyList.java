package Graphs;
import java.util.*;
public class BFSAdjacencyList {
    int v;
    static ArrayList <ArrayList<Integer>> adj;

    BFSAdjacencyList(int v){
        this.v = v;
        adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }
    void addEdge (int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void bfs(int start, boolean[] visited){
        Queue <Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);
        while (!q.isEmpty()){
            int front = q.remove();
            System.out.print(front + " ");

            for(int ele : adj.get(front)){
                if(!visited[ele]){
                    visited[ele] = true;
                    q.add(ele);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFSAdjacencyList g = new BFSAdjacencyList(5);
        g.addEdge(0, 1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(4,0);

        boolean[] visited = new boolean[5];
        for(int i = 0; i < 5; i++){
            if(!visited[i]){
                bfs(i, visited);
            }
        }

    }

}
