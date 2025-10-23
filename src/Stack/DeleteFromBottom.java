package Stack;
import java.util.*;
public class DeleteFromBottom {
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
        Stack <Integer> temp = new Stack<>();
        while(st.size()>1){
            temp.push(st.pop());
        }
        st.pop();
        while (!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.print("Revised Stack: "+st);
    }
}
