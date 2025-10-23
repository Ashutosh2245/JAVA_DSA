package Stack;
import java.util.*;
public class ReverseStackRecursively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter the number of elements in stack: ");
        int n = sc.nextInt();
        System.out.print("Enter the stack elements: ");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        System.out.println("Original Stack: " + stack);
        reverseStackRec(stack);
        System.out.println("Reversed Stack: " + stack);
    }
    public static void reverseStackRec(Stack<Integer> st) {
        if (st.size()==1) return;
        int top = st.pop();            // Remove top
        reverseStackRec(st);           // Reverse remaining stack
        insertAtBottom(st, top);       // Insert removed element at bottom
    }
    public static void insertAtBottom(Stack<Integer> st, int val) {
        if (st.isEmpty()) {
            st.push(val);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, val);
        st.push(top);
    }
}
