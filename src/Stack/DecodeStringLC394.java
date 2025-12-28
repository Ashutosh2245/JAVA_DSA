package Stack;
import java.util.*;
public class DecodeStringLC394 {
    public static String decodeString(String s) {
        Stack<Object> st = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            else if (ch == '[') {
                st.push(curr);
                st.push(num);
                curr = new StringBuilder();
                num = 0;
            }
            else if (ch == ']') {
                int repeat = (int) st.pop();
                StringBuilder prev = (StringBuilder) st.pop();
                for (int i = 0; i < repeat; i++) {
                    prev.append(curr);
                }
                curr = prev;
            }
            else {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();

        String s1 = decodeString(s);
        System.out.print("Decoded String: "+s1);
    }
}

