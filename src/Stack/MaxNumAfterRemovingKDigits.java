package Stack;
import java.util.*;
public class MaxNumAfterRemovingKDigits {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        int n = 1328;
        int temp = n;
        int k = 2;

        while (temp > 0) {
            int dig = temp % 10;
            temp = temp / 10;

            while (!st.isEmpty() && k > 0 && st.peek() < dig) {
                st.pop();
                k--;
            }

            st.push(dig);
        }

        while (k > 0) {
            st.pop();
            k--;
        }

        while (!st.isEmpty()) {
            System.out.print(st.pop());
        }
    }
}