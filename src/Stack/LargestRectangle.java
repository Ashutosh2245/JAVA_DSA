package Stack;
import java.util.Stack;
class LargestRectangle {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>(); // stores indices
        for (int i = 0; i <= n; i++) {
            int currentHeight;
            if (i == n) {
                currentHeight = 0; // Add a zero at the end
            } else {
                currentHeight = heights[i];
            }
            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int topIndex = stack.pop();
                int height = heights[topIndex];
                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }
                int area = height * width;
                if (area > maxArea) {
                    maxArea = area;
                }
            }
            stack.push(i);
        }
        return maxArea;
    }
}
class Main {
    public static void main(String[] args) {
        LargestRectangle lr = new LargestRectangle();
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println("Largest Rectangle Area: " + lr.largestRectangleArea(heights));
    }
}

