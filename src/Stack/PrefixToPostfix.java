package Stack;
import java.util.*;
public class PrefixToPostfix {
    static boolean isOperator(char ch) {
        return ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Prefix Expression: ");
        String prefix = sc.nextLine();
        Stack<String> st = new Stack<>();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            if (ch == ' ') continue;
            if (Character.isLetterOrDigit(ch)) {
                st.push(ch + "");
            }
            else if (isOperator(ch)) {
                String op1 = st.pop();
                String op2 = st.pop();
                String exp = op1 + op2 + ch;
                st.push(exp);
            }
        }
        System.out.println("Postfix Expression: " + st.peek());
    }
}

