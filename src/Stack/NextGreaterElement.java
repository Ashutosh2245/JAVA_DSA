package Stack;
import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = nextGreater(arr);
        System.out.println("Next Greater Elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " → " + result[i]);
        }
    }
    static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i])
                st.pop();
            nge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return nge;
    }
}

