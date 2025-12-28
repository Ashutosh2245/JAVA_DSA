package Stack;
import java.util.*;
public class PostfixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Infix Expression: ");
        String infix = sc.nextLine();
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix Expression: " + postfix);
        int result = evaluatePostfix(postfix);
        System.out.println("Evaluated Result: " + result);
    }
    static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                ans.append(ch);
            }
            else if (ch == '(') {
                st.push(ch);
            }
            else if (ch == ')') {
                while (st.peek() != '(') {
                    ans.append(st.pop());
                }
                st.pop();
            }
            else {
                while (!st.isEmpty() && st.peek() != '(' &&
                        precedence(st.peek()) >= precedence(ch)) {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.toString();
    }
    static int evaluatePostfix(String postfix) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isDigit(ch)) {
                st.push(ch - '0');
            }
            else {
                int b = st.pop();
                int a = st.pop();
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
