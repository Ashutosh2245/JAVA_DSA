package Stack;
import java.util.*;
public class DisplayStack {
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

        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()){
            temp.push(st.pop());
        }
        System.out.println(temp);
        System.out.println(st);
        System.out.println(temp.size());
        System.out.println(st.size());
        while(!temp.isEmpty()){
            int x = temp.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(temp);
        System.out.println(temp.size());

        System.out.println();
        int[] arr = new int[n];
        for (int i = n-1; i >=0; i--) {
            arr[i] = st.pop();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
    }
}
