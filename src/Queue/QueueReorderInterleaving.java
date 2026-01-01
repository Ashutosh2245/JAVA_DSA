// GFG

package Queue;
import java.util.*;
public class QueueReorderInterleaving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        System.out.print("Enter the size of queue: ");
        int n = sc.nextInt();
        System.out.print("Enter queue elements: ");
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        System.out.println("Queue: "+q); // 1 2 3 4 5 6 7 8
        Stack <Integer> st = new Stack<>();
        for (int i = 1; i <= n/2; i++) {
            st.push(q.remove());
        } // 5 6 7 8                      top 4 3 2 1
        while (!st.isEmpty()){
            q.add(st.pop());
        } // 5 6 7 8 4 3 2 1
        for (int i = 1; i <= n/2 ; i++) {
            st.push(q.remove());
        } // 4 3 2 1                     top 8 7 6 5
        while (!st.isEmpty()){
            q.add(st.pop());
            q.add(q.remove());
        } // 8 4 7 3 6 2 5 1
        System.out.println("Queue: "+q);
        // Reversing the queue
        while (!q.isEmpty()){
            st.push(q.remove());
        }
        while (!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println("Reordered Queue: "+q);
        // 1 5 2 6 3 7 4 8
    }
}
