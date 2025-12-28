package Stack;
import java.util.*;
public class DisplayStackRecursively {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of stack: ");
        int n = sc.nextInt();

        System.out.print("Enter the stack elements: ");
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }

        System.out.println("\nBottom to Top:");
        displayBottomToTop(st);

        System.out.println("\nTop to Bottom:");
        displayTopToBottom(st);
    }
    public static void displayBottomToTop(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        displayBottomToTop(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void displayTopToBottom(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top + " ");
        displayTopToBottom(st);
        st.push(top);
    }
}
