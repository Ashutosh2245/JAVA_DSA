package Stack;
import java.util.*;
public class RemoveFromAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of stack: ");
        int n = sc.nextInt();

        System.out.print("Enter the stack elements: ");
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }
        Stack<Integer> temp = new Stack<>();
        System.out.print("Enter the position (0 based from bottom): ");
        int pos = sc.nextInt();

        while(st.size()>pos+1){
            temp.push(st.pop());
        }
        st.pop();
        while (!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println("Revised Stack: "+st);
        while (!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
}
