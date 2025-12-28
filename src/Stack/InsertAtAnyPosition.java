// INSERT AT ANY POS FROM BOTTOM
package Stack;
import java.util.*;
public class InsertAtAnyPosition{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of stack: ");
        int n = sc.nextInt();
        System.out.print("Enter the stack elements: ");
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }
        //System.out.println(st);
        Stack<Integer> temp = new Stack<>();
        System.out.print("Enter the position where element to be inserted (0-based from bottom): ");
        int pos = sc.nextInt();
        System.out.print("Enter the element value: ");
        int val = sc.nextInt();

        while (st.size() > pos) {
            temp.push(st.pop());
        }
        //System.out.println(st);
        //System.out.println(temp);
        st.push(val);
        //System.out.println(st);
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
        System.out.println("Revised Stack: " + st);
        while (!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
}


// INSERT AT ANY POS FROM TOP
/*package Stack;
import java.util.*;
class InsertFromTop {
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
        System.out.print("Enter the position (0-based from top): ");
        int pos = sc.nextInt();
        System.out.print("Enter the element value: ");
        int val = sc.nextInt();
        for (int i = 0; i < pos; i++) {
            temp.push(st.pop());
        }
        st.push(val);
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
        System.out.println("Revised Stack: " + st);
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}*/

