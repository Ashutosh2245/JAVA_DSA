package Stack;
import java.util.*;
public class PrefixToInfix {
    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Prefix Expression: ");
        String prefix = sc.nextLine();
        Stack<String> st = new Stack<>();
        // traverse from right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            if (ch == ' ') continue;
            if (Character.isLetterOrDigit(ch)) {
                st.push(ch + "");
            }
            // operator
            else if (isOperator(ch)) {
                String op1 = st.pop();
                String op2 = st.pop();
                String exp = "(" + op1 + ch + op2 + ")";
                st.push(exp);
            }
        }
        System.out.println("Infix Expression: " + st.peek());
    }
}
