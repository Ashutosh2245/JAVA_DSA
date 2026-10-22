package Greedy;
import java.util.*;
public class MaximizeSumOfSquareDigitsLC3723 {
    public static String maxSum(int num, int sum){
        if(sum > 9*num) return ""; // Because, n digits ke number ka max sum can be 9*n (As, 2 digits ke no ka max sum will be 18 (99->9+9)

        StringBuilder ans = new StringBuilder();

        while(sum >= 9){
            ans.append("9");
            sum = sum - 9;
        }

        if (sum > 0){
            ans.append((char) ('0' + sum));
        }

        while (ans.length() < num){
            ans.append('0');
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of digits in number: ");
        int num = sc.nextInt();

        System.out.print("Enter the sum of digits: ");
        int sum = sc.nextInt();

        String ans = maxSum(num, sum);

        System.out.println("Answer will be: "+ans);
    }
}
