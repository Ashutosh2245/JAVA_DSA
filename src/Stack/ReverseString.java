package Stack;
import java.util.Stack;
public class ReverseString {
    public static void main(String[] args) {
        String str = "HELLO";
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) stack.push(c);
        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) reversed.append(stack.pop());

        System.out.println("Reversed String: " + reversed);
    }
}
