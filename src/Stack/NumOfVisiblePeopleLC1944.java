package Stack;
import java.util.*;
public class NumOfVisiblePeopleLC1944 {
    public static int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int count = 0;
            while (!stack.isEmpty() && stack.peek() < heights[i]) {
                stack.pop();
                count++;
            }
            if (!stack.isEmpty()) {
                count++;
            }
            ans[i] = count;
            stack.push(heights[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        int[] heights = new int[n];
        System.out.println("Enter heights:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        int[] result = canSeePersonsCount(heights);
        System.out.println("Visible people count:");
        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
