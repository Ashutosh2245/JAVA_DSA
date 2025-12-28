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
        Stack <Integer> st2 = new Stack<>();
        while (!st.isEmpty()) {
            temp.push(st.pop());
        }
        while (!temp.isEmpty()) {
            st2.push(temp.pop());
        }
        while (!st2.isEmpty()){
            st.push(st2.pop());
        }
        System.out.println("Original(Reversed Stack): "+st);
    }
}
