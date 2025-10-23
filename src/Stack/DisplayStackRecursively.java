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
            int val = sc.nextInt();
            st.push(val);
        }
        System.out.println(st);
        displayReverseRec(st);
        System.out.println("\n"+st);
        displayRec(st);

    }
    public static void displayReverseRec(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverseRec(st);
        st.push(top);
    }
    public static void displayRec(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }
}
