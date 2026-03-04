// Method 1 -->> BFS

/*
package Graphs;
import java.util.*;
public class CourseSchedule2LC210 {
    public static int[] findOrder(int n, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        int[] inDegree = new int[n];
        for(int[] ele : prerequisites) {
            int u = ele[1];
            int v = ele[0];

            adj.get(u).add(v);
            inDegree[v]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            if(inDegree[i] == 0) {
                q.add(i);
            }
        }
        int[] ans = new int[n];
        int idx = 0;
        while(!q.isEmpty()) {
            int node = q.poll();
            ans[idx++] = node;
            for(int neighbour : adj.get(node)) {
                inDegree[neighbour]--;
                if(inDegree[neighbour] == 0) {
                    q.add(neighbour);
                }
            }
        }
        if(idx == n) return ans;
        return new int[0];
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] prerequisites = {
                {1, 0},
                {2, 0},
                {3, 1},
                {3, 2}
        };

        int[] order = findOrder(n, prerequisites);

        if(order.length == 0) {
            System.out.println("Cycle detected. No valid order.");
        } else {
            System.out.println("Valid course order:");
            for(int course : order) {
                System.out.print(course + " ");
            }
        }
    }
}
 */

// Method 2 -- >> DFS

package Graphs;
import java.util.*;
public class CourseSchedule2LC210 {

    public static int[] findOrder(int n, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // build graph
        for(int[] p : prerequisites) {
            int u = p[1];
            int v = p[0];
            adj.get(u).add(v);
        }

        int[] state = new int[n];   // 0,1,2
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            if(state[i] == 0) {
                if(hasCycle(adj, state, stack, i)) {
                    return new int[0];  // cycle found
                }
            }
        }

        int[] ans = new int[n];
        int idx = 0;

        while(!stack.isEmpty()) {
            ans[idx++] = stack.pop();
        }

        return ans;
    }

    private static boolean hasCycle(ArrayList<ArrayList<Integer>> adj, int[] state, Stack<Integer> stack, int node) {
        state[node] = 1; // visiting

        for(int neighbour : adj.get(node)) {

            if(state[neighbour] == 1)
                return true;   // cycle

            if(state[neighbour] == 0) {
                if(hasCycle(adj, state, stack, neighbour))
                    return true;
            }
        }

        state[node] = 2; // visited
        stack.push(node); // topo store
        return false;
    }
    public static void main(String[] args) {
        int n = 4;

        int[][] prerequisites = {
                {1, 0},
                {2, 0},
                {3, 1},
                {3, 2}
        };

        int[] order = findOrder(n, prerequisites);

        if(order.length == 0) {
            System.out.println("Cycle detected. No valid order.");
        } else {
            System.out.println("Valid course order:");
            for(int course : order) {
                System.out.print(course + " ");
            }
        }
    }
}