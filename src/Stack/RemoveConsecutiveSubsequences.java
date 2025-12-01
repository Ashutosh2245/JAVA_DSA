package Stack;
import java.util.*;
public class RemoveConsecutiveSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> result = removeAllConsecutiveSubsequences(arr);
        System.out.print("After removing consecutive subsequences: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
    static List<Integer> removeAllConsecutiveSubsequences(int[] arr) {
        Stack<int[]> stack = new Stack<>(); // {value, count}
        for (int num : arr) {
            if (!stack.isEmpty() && stack.peek()[0] == num) {
                stack.peek()[1]++;
            } else {
                stack.push(new int[]{num, 1});
            }
            if (stack.peek()[1] > 1) {
                stack.pop();
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int[] pair : stack) {
            result.add(pair[0]);
        }
        return result;
    }
}
