package Stack;
import java.util.Stack;
class StockSpanner{
    private Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }
    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty()) {
            int[] top = stack.peek();
            if (top[0] <= price) {
                span += top[1];
                stack.pop();
            } else {
                break;
            }
        }
        stack.push(new int[]{price, span});
        return span;
    }
}
class StockSpan {
    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        System.out.println("Stock Spans:");
        for (int price : prices) {
            System.out.print(stockSpanner.next(price) + " ");
        }
    }
}
