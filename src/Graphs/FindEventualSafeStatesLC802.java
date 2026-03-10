// Method 1 -->> BFS

/*
package Graphs;
import java.util.*;
public class FindEventualSafeStatesLC802 {
    public static ArrayList<Integer> eventualSafeNodes(int[][] edges) {
        int n = edges.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList <>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList <>());
        }
        int[] inDeg = new int[n];
        for(int i = 0; i < n; i++){
            for(int v : edges[i]){
                adj.get(v).add(i);
                inDeg[i]++;
            }
        }
        // Kahn's algorithm
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList <>();
        for(int i = 0; i < n; i++) {
            if(inDeg[i] == 0) {
                q.add(i);
            }
        }
        while(!q.isEmpty()) {
            int node = q.poll();
            ans.add(node);
            for(int ele : adj.get(node)) {
                inDeg[ele]--;
                if(inDeg[ele] == 0) {
                    q.add(ele);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[][] graph = {{1,2},{2,3},{5},{0},{5},{},{}};
        ArrayList<Integer> ans = eventualSafeNodes(graph);
        System.out.println(ans);
    }
}
*/

package Graphs;
import java.util.*;
class Solution {
    public static ArrayList<Integer> eventualSafeNodes(int[][] graph) {

        int n = graph.length;
        int[] state = new int[n];
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(dfs(i, graph, state)){
                ans.add(i);
            }
        }

        return ans;
    }

    static boolean dfs(int node, int[][] graph, int[] state){

        if(state[node] == 1) return false;
        if(state[node] == 2) return true;

        state[node] = 1;

        for(int ele : graph[node]){
            if(!dfs(ele, graph, state)){
                return false;
            }
        }

        state[node] = 2;
        return true;
    }

    public static void main(String[] args) {
        int[][] graph = {{1,2},{2,3},{5},{0},{5},{},{}};
        ArrayList<Integer> ans = eventualSafeNodes(graph);
        System.out.println(ans);
    }
}