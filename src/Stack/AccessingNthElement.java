package Stack;
import java.util.*;
public class AccessingNthElement {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        //System.out.println(st.isEmpty());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements in stack: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of stack: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            st.push(val);
        }
        System.out.println("Stack: "+st);
        // Accessing Nth element
        System.out.print("Enter the position of element to access: ");
        int pos = sc.nextInt();
        while (st.size()>pos){
            st.pop();
        }
        System.out.println("Required element: "+st.peek());
        System.out.print("Remaining Stack: "+st);
    }
}
