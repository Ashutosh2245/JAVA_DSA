package Stack;
import java.util.*;
public class RemoveConsecutiveDuplicates {
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == ch) {
                st.pop(); // remove duplicate
            } else {
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("After removing consecutive duplicates: " + removeDuplicates(s));
    }
}

