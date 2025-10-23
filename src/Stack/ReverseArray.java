package Stack;
import java.util.Stack;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();

        for (int num : arr)
            stack.push(num);

        System.out.println("Reversed order:");
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}

