package Stack;
import java.util.*;
public class ReverseStackIterative {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of stack: ");
        int n = sc.nextInt();
        System.out.print("Enter stack elements: ");
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }
        System.out.println("Original Stack: " + st);
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()) {
            temp.push(st.pop());
        }
        System.out.println("Reversed Stack: " + temp);
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
        System.out.println("Original(Restored Stack): "+st);
    }
}
