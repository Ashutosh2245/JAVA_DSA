//General Solution

/*
package Stack;
import java.util.Stack;
public class MinStack {
    Stack <Integer> st = new Stack<>();
    int min = -1;
    public MinStack() {
    }
    public void push(int val) {
        if(st.isEmpty()){
            st.push(val);
            min=val;
        }
        else if(val >= min){
            st.push(val);
        }
        else{ // val < min
            st.push(2*val-min);
            min = val;
        }
    }
    public void pop() {
        if(st.isEmpty()) return;
        else if(st.peek()>=min) st.pop();
        else{ // st.peek()<min
            int old = 2*min-st.peek();
            min = old;
            st.pop();
        }
    }
    public int top() {
        if(st.isEmpty()) return -1;
        else if(st.peek()>=min) return st.peek();
        else{ //q<min
            return min;
        }
    }
    public int getMin() {
        if(st.isEmpty()) return -1;
        return min;
    }
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(3);
        ms.push(5);
        ms.push(7);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.top());
        ms.pop();
        System.out.println(ms.getMin());

    }
}
*/

// To handle integer out of bound issue
package Stack;
import java.util.*;
public class MinStack {
    Stack <Long> st = new Stack<>();
    long min = -1;
    public MinStack() {
    }
    public void push(int val) {
        long x = (long) val;
        if(st.isEmpty()){
            st.push(x);
            min=x;
        }
        else if(x >= min){
            st.push(x);
        }
        else{ // x < min
            st.push(2*x-min);
            min = x;
        }
    }
    public void pop() {
        if(st.isEmpty()) return;
        else if(st.peek()>=min) st.pop();
        else{ // st.peek()<min
            long old = 2*min-st.peek();
            min = old;
            st.pop();
        }
    }
    public int top() {
        long q = st.peek();
        if(st.isEmpty()) return -1;
        else if(q>=min) return (int)q;
        else{ //q<min
            return (int)min;
        }
    }

    public int getMin() {
        if(st.isEmpty()) return -1;
        return (int)min;
    }
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(3);
        ms.push(5);
        ms.push(7);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.top());
        ms.pop();
        System.out.println(ms.getMin());
    }
}
