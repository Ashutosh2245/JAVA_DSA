package Stack;
public class OverflowAndUnderflow {
    static final int MAX = 5;
    int top = -1;
    int[] stack = new int[MAX];
    void push(int data) {
        if (top == MAX - 1) {
            System.out.println("Stack Overflow! Cannot push " + data);
            return;
        }
        stack[++top] = data;
    }
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Nothing to pop.");
            return -1;
        }
        return stack[top--];
    }

    public static void main(String[] args) {
        OverflowAndUnderflow s = new OverflowAndUnderflow();
        for (int i = 1; i <= 6; i++) s.push(i);
        for (int i = 1; i <= 6; i++) s.pop();
    }
}
