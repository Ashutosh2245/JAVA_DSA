package Stack;
import java.util.*;
public class InsertAtBottomRecursively {
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
        System.out.print("Enter the no to be inserted: ");
        int val = sc.nextInt();
        insertBottomRec(st,val);
        System.out.println("Stack after insertion: "+st);
    }
    public static void insertBottomRec(Stack<Integer> st, int val){
        if(st.isEmpty()) {
            st.push(val);
            return;
        }
        int top = st.pop();
        insertBottomRec(st,val);
        st.push(top);
    }
}
