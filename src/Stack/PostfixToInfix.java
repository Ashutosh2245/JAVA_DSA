package Stack;
import java.util.*;
public class PostfixToInfix {
    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Postfix Expression: ");
        String postfix = sc.nextLine();
        Stack<String> st = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (ch == ' ') continue;
            // operand
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            }
            // operator
            else if (isOperator(ch)) {
                String b = st.pop();
                String a = st.pop();
                String exp = "(" + a + " " + ch + " " + b + ")";
                st.push(exp);
            }
        }
        System.out.println("Infix Expression: " + st.peek());
    }
}
