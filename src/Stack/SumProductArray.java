package Stack;
import java.util.Scanner;
class SumProductArrayUsingStack {
    int top = -1;
    int[] stack;
    int size;

    SumProductArrayUsingStack(int size) {
        this.size = size;
        stack = new int[size];
    }
    void push(int val) {
        stack[++top] = val;
    }

    int pop() {
        return stack[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
}
public class SumProductArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        SumProductArrayUsingStack stack = new SumProductArrayUsingStack(n);
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            stack.push(val);
        }
        int sum = 0;
        int product = 1;
        while (!stack.isEmpty()) {
            int val = stack.pop();
            sum += val;
            product *= val;
        }
        System.out.println("Sum of elements = " + sum);
        System.out.println("Product of elements = " + product);

        sc.close();
    }
}
