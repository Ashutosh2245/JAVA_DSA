package Stack;
import java.util.Stack;
public class PrintStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("All stack elements:");
        for (String s : stack) {
            System.out.println(s);
        }
    }
}
