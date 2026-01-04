package Stack;
import java.util.*;
public class PostfixToPrefix {
    static boolean isOperator(char ch) {
        return ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Postfix Expression: ");
        String postfix = sc.nextLine();
        Stack<String> st = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (ch == ' ') continue;
            if (Character.isLetterOrDigit(ch)) {
                st.push(ch + "");
            }
            else if (isOperator(ch)) {
                String op2 = st.pop();
                String op1 = st.pop();
                String exp = ch + op1 + op2;
                st.push(exp);
            }
        }
        System.out.println("Prefix Expression: " + st.peek());
    }
}

