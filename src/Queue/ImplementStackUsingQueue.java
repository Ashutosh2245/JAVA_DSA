// Push Efficient

package Queue;
import java.util.*;
public class ImplementStackUsingQueue {
    private Queue<Integer> q;
    public ImplementStackUsingQueue() {
        q = new LinkedList<>();
    }
    // PUSH is efficient → O(1)
    public void push(int x) {
        q.add(x);
    }
    // POP is costly → O(n)
    public int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
        return q.remove();
    }
    // TOP is costly → O(n)
    public int top() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        for (int i = 0; i < q.size()- 1; i++) {
            q.add(q.remove());
        }
        int val = q.peek();
        q.add(q.remove()); // restore order
        return val;
    }
    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImplementStackUsingQueue stack = new ImplementStackUsingQueue();
        System.out.print("Enter number of elements to push: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top after pop: " + stack.top());
        System.out.println("Is stack empty? " + stack.empty());
        sc.close();
    }
}


//Pop  Efficient

/*
package Queue;
import java.util.*;
public class ImplementStackUsingQueue {
    private Queue<Integer> q;
    public ImplementStackUsingQueue() {
        q = new LinkedList<>();
    }
    public void push(int x) {
        q.add(x);
        int size = q.size();

        for (int i = 0; i < size - 1; i++) {
            q.add(q.remove());
        }
    }
    public int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q.remove();
    }
    public int top() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImplementStackUsingQueue stack = new ImplementStackUsingQueue();
        System.out.print("Enter number of elements to push: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top after pop: " + stack.top());
        System.out.println("Is stack empty? " + stack.empty());
        sc.close();
    }
}
*/