package Stack;
import java.util.*;
public class InsertAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of stack: ");
        int n = sc.nextInt();
        System.out.print("Enter the stack elements: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            st.push(val);
        }
        Stack<Integer> temp = new Stack<>();
        System.out.print("Enter the position where element to be inserted (0-based from bottom): ");
        int pos = sc.nextInt();
        System.out.print("Enter the element value: ");
        int val = sc.nextInt();
        while (st.size() > pos) {
            temp.push(st.pop());
        }
        st.push(val);
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
        System.out.println("Revised Stack: " + st);
    }
}
