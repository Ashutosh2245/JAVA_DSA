package Stack;
import java.util.*;
public class NextSmallerAndPreviousSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result1 = nextSmaller(arr);
        System.out.print("Next Smaller Elements : ");
        for (int num: result1)
            System.out.print(num+" ");

        System.out.println();
        int[] result2 = prevSmaller(arr);
        System.out.print("Previous Smaller Elements : ");
        for (int num: result2)
            System.out.print(num+" ");
    }
    static int[] prevSmaller(int[] arr) {
        int n = arr.length;
        int[] psm = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                psm[i] = -1;
            } else {
                psm[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return psm;
    }
    static int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] nsm = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nsm[i] = -1;
            } else {
                nsm[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nsm;
    }
}
