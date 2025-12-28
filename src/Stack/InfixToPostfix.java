package Stack;
import java.util.*;
public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Infix Expression: ");
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Operand (digit or letter)
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }
            // Opening bracket
            else if (ch == '(') {
                st.push(ch);
            }
            // Closing bracket
            else if (ch == ')') {
                while (st.peek() != '(') {
                    ans.append(st.pop());
                }
                st.pop(); // remove '('
            }
            // Operator
            else {
                while (!st.isEmpty() && st.peek() != '(' &&
                        precedence(st.peek()) >= precedence(ch)) {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }
        // Remaining operators
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        System.out.print("Final Postfix Expression: ");
        System.out.println(ans.toString());
    }
    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return 0;
    }
}

