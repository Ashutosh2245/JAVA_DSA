// Method 1 -->> BFS

/*
package Graphs;
import java.util.*;
public class CourseScheduleLC207 {
    public static boolean canFinish(int n, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        int[] inDegree = new int[n];

        // build graph
        for(int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            inDegree[v]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            if(inDegree[i] == 0) {
                q.add(i);
            }
        }

        int count = 0;

        while(!q.isEmpty()) {
            int node = q.poll();
            count++;

            for(int neighbour : adj.get(node)) {
                inDegree[neighbour]--;

                if(inDegree[neighbour] == 0) {
                    q.add(neighbour);
                }
            }
        }
        return count == n;
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 3}
        };

        boolean result = canFinish(n, edges);

        System.out.println("Can finish all courses: " + result);
    }
}
*/

// Method 2 -- >> DFS
package Graphs;
import java.util.*;
public class CourseScheduleLC207{
    public static boolean canFinish(int n, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // build graph
        for(int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
        }

        int[] state = new int[n];

        for(int i = 0; i < n; i++) {
            if(state[i] == 0) {
                if(hasCycle(adj, state, i))
                    return false;
            }
        }

        return true;
    }

    private static boolean hasCycle(ArrayList<ArrayList<Integer>> adj, int[] state, int node) {
        state[node] = 1;

        for(int neighbour : adj.get(node)) {

            if(state[neighbour] == 1)
                return true;

            if(state[neighbour] == 0) {
                if(hasCycle(adj, state, neighbour))
                    return true;
            }
        }

        state[node] = 2; // visited
        return false;
    }

    public static void main(String[] args) {
        int n = 4;

        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 3}
        };

        System.out.println("Can finish all courses: " +canFinish(n, edges));
    }
}
