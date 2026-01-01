package Queue;

import java.util.*;

public class ReverseTheQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Queue: ");
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        System.out.println("Queue: " + q);
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        System.out.println("Reversed Queue: " + q);
        sc.close();
    }
}
