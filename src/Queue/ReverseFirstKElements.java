package Queue;
import java.util.*;
public class ReverseFirstKElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Queue: ");
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        System.out.println("Queue: " + q);
        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();
        if (k <= 0 || k > n) {
            System.out.println("Invalid value of K");
            return;
        }
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        for (int i = 0; i < n-k; i++) {
            q.add(q.remove());
        }
        System.out.println("Reversed Queue: " + q);
        sc.close();
    }
}
