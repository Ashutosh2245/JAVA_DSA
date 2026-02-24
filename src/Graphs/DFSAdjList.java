package Graphs;
import java.util.*;
public class DFSAdjList {

    int v;
    static ArrayList<ArrayList<Integer>> adj;

    DFSAdjList(int v){
        this.v = v;
        adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);   // remove for directed
    }

    static void dfs(int start, boolean[] visited){

        visited[start] = true;
        System.out.print(start + " ");

        for(int ele : adj.get(start)){
            if(!visited[ele]){
                dfs(ele, visited);
            }
        }
    }

    public static void main(String[] args) {

        DFSAdjList g = new DFSAdjList(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(4, 0);

        boolean[] visited = new boolean[5];
        for(int i = 0; i < 5; i++){
            if(!visited[i]){
                dfs(i, visited);
            }
        }
    }
}