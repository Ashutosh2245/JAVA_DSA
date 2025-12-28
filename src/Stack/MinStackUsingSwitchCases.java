package Stack;
import java.util.*;
public class MinStackUsingSwitchCases {
    static Stack <Long> st = new Stack<>();
    static long min = -1;
    public MinStackUsingSwitchCases() {
    }
    public static void push(int val) {
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
    public static void pop() {
        if(st.isEmpty()) return;
        else if(st.peek()>=min) st.pop();
        else{ // st.peek()<min
            long old = 2*min-st.peek();
            min = old;
            st.pop();
        }
    }
    public static int top() {
        long q = st.peek();
        if(st.isEmpty()) return -1;
        else if(q>=min) return (int)q;
        else{ //q<min
            return (int)min;
        }
    }
    public static int getMin() {
        if(st.isEmpty()) return -1;
        return (int)min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int op = sc.nextInt();
            if (op == 1) {          // push
                int val = sc.nextInt();
                push(val);
            }
            else if (op == 2) {     // pop
                pop();
            }
            else if (op == 3) {     // top
                System.out.println(top());
            }
            else if (op == 4) {     // getMin
                System.out.println(getMin());
            }
            else if (op == 5) {     // exit
                break;
            }
        }
        sc.close();
    }
}

