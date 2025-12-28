package Stack;
import java.util.*;
public class InfixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Infix Expression: ");
        String s = sc.nextLine();
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // MULTI-DIGIT NUMBER FIX
            if (ch >= '0' && ch <= '9') {
                int num = 0;
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                val.push(num);
            }
            // opening bracket
            else if (ch == '(') {
                op.push(ch);
            }
            // closing bracket
            else if (ch == ')') {
                while (op.peek() != '(') {
                    solve(val, op);
                }
                op.pop();
            }
            // operator
            else {
                while (!op.isEmpty() && op.peek() != '(' &&
                        precedence(op.peek()) >= precedence(ch)) {
                    solve(val, op);
                }
                op.push(ch);
            }
        }
        while (!op.isEmpty()) {
            solve(val, op);
        }
        System.out.print("Final answer: ");
        System.out.println(val.peek());
    }
    static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }
    static void solve(Stack<Integer> val, Stack<Character> op) {
        int v2 = val.pop();
        int v1 = val.pop();
        char o = op.pop();
        if (o == '+') val.push(v1 + v2);
        if (o == '-') val.push(v1 - v2);
        if (o == '*') val.push(v1 * v2);
        if (o == '/') val.push(v1 / v2);
    }
}
