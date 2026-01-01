// POP EFFICIENT

package Queue;
import java.util.*;
public class QueueUsingStacks {
    Stack <Integer> st;
    Stack <Integer> helper;
    public QueueUsingStacks() {
        st = new Stack<>();
        helper = new Stack<>();
    }
    public void push(int x) {
        if(st.isEmpty()){
            st.push(x);
        }
        else{
            while(!st.isEmpty()){
                helper.push(st.pop());
            }
            st.push(x);
            while(!helper.isEmpty()){
                st.push(helper.pop());
            }
        }
    }
    public int pop() {
        return st.pop();
    }
    public int peek() {
        return st.peek();
    }
    public boolean empty() {
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingStacks q = new QueueUsingStacks();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            q.push(sc.nextInt());
        }
        System.out.println("Front element (peek): " + q.peek());
        System.out.println("Removed element (pop): " + q.pop());
        System.out.println("Queue empty? " + q.empty());
    }
}



// PUSH EFFICIENT

/*
package Queue;
import java.util.*;
public class QueueUsingStacks {
    Stack<Integer> st;
    Stack<Integer> helper;
    public QueueUsingStacks() {
        st = new Stack<>();
        helper = new Stack<>();
    }
    public void push(int x) {
        st.push(x);
    }
    public int pop() {
        if(st.isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        while (st.size() > 1) {
            helper.push(st.pop());
        }
        int x = st.pop();
        while (!helper.isEmpty()) {
            st.push(helper.pop());
        }
        return x;
    }
    public int peek() {
        if(st.isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        while (st.size() > 1) {
            helper.push(st.pop());
        }
        int x = st.peek();
        while (!helper.isEmpty()) {
            st.push(helper.pop());
        }
        return x;
    }
    public boolean empty() {
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingStacks q = new QueueUsingStacks();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            q.push(sc.nextInt());
        }
        System.out.println("Front element (peek): " + q.peek());
        System.out.println("Removed element (pop): " + q.pop());
        System.out.println("Queue empty? " + q.empty());
    }
}
*/