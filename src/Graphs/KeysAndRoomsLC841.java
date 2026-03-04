// Method 1 -->> BFS

/*
package Graphs;
import java.util.*;
public class KeysAndRoomsLC841 {

    public static boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean[] vis = new boolean[n];
        bfs(adj, vis, 0);

        for(boolean b : vis)
            if(!b) return false;

        return true;
    }

    public static void bfs(List<List<Integer>> adj, boolean[] visited, int start) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);

        while(!q.isEmpty()) {
            int node = q.poll();

            for(int nei : adj.get(node)) {
                if(!visited[nei]) {
                    visited[nei] = true;
                    q.add(nei);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rooms: ");
        int n = sc.nextInt();
        List<List<Integer>> rooms = new ArrayList<>();


        for(int i = 0; i < n; i++) {
            System.out.print("Enter no of keys in room "+i+": ");
            int k = sc.nextInt();   // number of keys in this room

            List<Integer> temp = new ArrayList<>();

            for(int j = 0; j < k; j++) {
                System.out.print("Enter keys in this room: ");
                temp.add(sc.nextInt());
            }
            rooms.add(temp);
        }

        System.out.print("Can visit all rooms: ");
        System.out.println(canVisitAllRooms(rooms));
    }
}
 */

// Method 2 -->> DFS
package Graphs;
import java.util.*;
public class KeysAndRoomsLC841 {
    public static boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean[] vis = new boolean[n];
        dfs(adj, vis, 0);
        for (boolean ele : vis) {
            if(!ele){
                return false;
            }
        }
        return true;
    }

    public static void dfs(List<List<Integer>> adj, boolean[] visited, int start){
        visited[start] = true;

        for (int ele : adj.get(start)) {
            if(!visited[ele]){
                dfs(adj, visited, ele);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rooms: ");
        int n = sc.nextInt();
        List<List<Integer>> rooms = new ArrayList<>();


        for(int i = 0; i < n; i++) {
            System.out.print("Enter no of keys in room "+i+": ");
            int k = sc.nextInt();   // number of keys in this room

            List<Integer> temp = new ArrayList<>();

            for(int j = 0; j < k; j++) {
                System.out.print("Enter keys in this room: ");
                temp.add(sc.nextInt());
            }
            rooms.add(temp);
        }

        System.out.print("Can visit all rooms: ");
        System.out.println(canVisitAllRooms(rooms));
    }
}