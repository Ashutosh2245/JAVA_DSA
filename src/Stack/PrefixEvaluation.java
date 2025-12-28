package Stack;
import java.util.*;
public class PrefixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Infix Expression: ");
        String infix = sc.nextLine();
        String prefix = infixToPrefix(infix);
        System.out.println("Prefix Expression: " + prefix);
        int result = evaluatePrefix(prefix);
        System.out.println("Evaluated Result: " + result);
    }

    static String infixToPrefix(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(')
                sb.setCharAt(i, ')');
            else if (sb.charAt(i) == ')')
                sb.setCharAt(i, '(');
        }
        Stack<Character> st = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (Character.isDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (st.peek() != '(') {
                    postfix.append(st.pop());
                }
                st.pop();
            } else {
                while (!st.isEmpty() && st.peek() != '(' &&
                        precedence(st.peek()) > precedence(ch)) {
                    postfix.append(st.pop());
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            postfix.append(st.pop());
        }
        return postfix.reverse().toString();
    }

    static int evaluatePrefix(String prefix) {
        Stack<Integer> st = new Stack<>();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            if (Character.isDigit(ch)) {
                st.push(ch - '0');
            } else {
                int a = st.pop();
                int b = st.pop();
                switch (ch) {
                    case '+': st.push(a + b); break;
                    case '-': st.push(a - b); break;
                    case '*': st.push(a * b); break;
                    case '/': st.push(a / b); break;
                }
            }
        }
        return st.peek();
    }

    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return 0;
    }
}
