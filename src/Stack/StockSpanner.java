package Stack;
import java.util.Scanner;
import java.util.Stack;
public class StockSpanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = stockSpan(arr);
        System.out.print("Stock Span: ");
        for (int num: result)
            System.out.print(num+" ");
    }
    static int[] stockSpan(int[] arr){
        int n = arr.length;
        int[] span = new int[n];
        Stack <Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
           while (!st.isEmpty() && arr[st.peek()] <= arr[i]){
               st.pop();
           }
           if(st.isEmpty()){
               span[i] = i+1;
           }
           else{
               span[i] = i-st.peek();
           }
           st.push(i);
        }
        return span;
    }
}





//package Stack;
//import java.util.Stack;
//class StockSpanner{
//    private Stack<int[]> stack;
//    public StockSpanner() {
//        stack = new Stack<>();
//    }
//    public int next(int price) {
//        int span = 1;
//        while (!stack.isEmpty()) {
//            int[] top = stack.peek();
//            if (top[0] <= price) {
//                span += top[1];
//                stack.pop();
//            } else {
//                break;
//            }
//        }
//        stack.push(new int[]{price, span});
//        return span;
//    }
//}
//class StockSpan {
//    public static void main(String[] args) {
//        StockSpanner stockSpanner = new StockSpanner();
//        int[] prices = {100, 80, 60, 70, 60, 75, 85};
//
//        System.out.print("Stock Spans: ");
//        for (int price : prices) {
//            System.out.print(stockSpanner.next(price) + " ");
//        }
//    }
//}
