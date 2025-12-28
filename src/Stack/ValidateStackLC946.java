package Stack;
import java.util.*;
public class ValidateStackLC946 {
    static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for (int x : pushed) {
            st.push(x);
            while (!st.isEmpty() && j < popped.length && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] pushed = new int[n];
        int[] popped = new int[n];
        System.out.print("Enter pushed elements: ");
        for (int i = 0; i < n; i++) {
            pushed[i] = sc.nextInt();
        }

        System.out.print("Enter popped elements: ");
        for (int i = 0; i < n; i++) {
            popped[i] = sc.nextInt();
        }
        System.out.println(validateStackSequences(pushed, popped));
        sc.close();
    }
}

