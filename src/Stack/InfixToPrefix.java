package Stack;
import java.util.*;
public class InfixToPrefix {
    static int priority(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return -1;
    }
    static String infixToPrefix(String infix) {
        // Step 1: reverse infix
        StringBuilder sb = new StringBuilder(infix);
        sb.reverse();
        // Step 2: swap brackets
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(')
                sb.setCharAt(i, ')');
            else if (sb.charAt(i) == ')')
                sb.setCharAt(i, '(');
        }
        // Step 3: infix to postfix
        Stack<Character> st = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }
            else if (ch == '(') {
                st.push(ch);
            }
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    postfix.append(st.pop());
                }
                st.pop();
            }
            else {
                while (!st.isEmpty() && priority(ch) < priority(st.peek())) {
                    postfix.append(st.pop());
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            postfix.append(st.pop());
        }
        // Step 4: reverse postfix → prefix
        return postfix.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Infix Expression: ");
        String infix = sc.nextLine();
        System.out.println("Prefix Expression: "+infixToPrefix(infix));
    }
}
