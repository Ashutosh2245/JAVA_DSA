package Stack;
import java.util.*;
public class BasicStackPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        // input
        for (int i = 0; i < 5; i++) {
            st1.push(sc.nextInt());
        }
        // Bottom → Top (default)
        System.out.println("Bottom to Top: " + st1);

        // Top → Bottom printing
        System.out.print("Top to Bottom: ");
        while (!st1.isEmpty()) {
            int x = st1.pop();
            System.out.print(x + " ");
            st2.push(x);
        }
        System.out.println();

        // restore original stack
        System.out.print("Bottom to top: ");
        while (!st2.isEmpty()) {
            int y = st2.pop();
            System.out.print(y + " ");
            st1.push(y);
        }
        System.out.println();

        System.out.println("Restored Stack: " + st1);
        System.out.println("Temporary Stack: " + st2);
    }
}
