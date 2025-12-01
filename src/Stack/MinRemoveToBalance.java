package Stack;
import java.util.*;
public class MinRemoveToBalance {
    public static int minRemove(String s) {
        Stack<Character> st = new Stack<>();
        int removals = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    removals++;
                } else {
                    char top = st.peek();
                    if ((ch == ')' && top == '(') ||
                            (ch == '}' && top == '{') ||
                            (ch == ']' && top == '[')) {
                        st.pop(); // valid pair
                    } else {
                        removals++; // mismatch
                    }
                }
            }
        }
        removals += st.size();
        return removals;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bracket string: ");
        String s = sc.nextLine();
        System.out.println("Minimum brackets to remove: " + minRemove(s));
    }
}

