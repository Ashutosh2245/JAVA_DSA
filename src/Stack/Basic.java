package Stack;
import java.util.Stack;
public class Basic {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        System.out.println("Stack: "+st);
        System.out.println("Peek element: "+st.peek()); // It only finds the peek element
        System.out.println("Size: "+st.size());
        System.out.println(st.pop()); //It finds the peak element and also deletes that element
        System.out.println("After deleting top most element: "+st);
        System.out.println("Size: "+st.size());

        // to access first element inserted in stack
        while (st.size()>1){
            st.pop();
        }
        // Size has become 1
        System.out.println("First element: "+st.peek());
        System.out.println(st.isEmpty());
        

    }
}
