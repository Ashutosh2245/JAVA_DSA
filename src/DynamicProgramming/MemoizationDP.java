package DynamicProgramming;
import java.util.*;
public class MemoizationDP {
    public static int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n, dp);

    }
    public static int solve(int n, int[] dp){
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = solve(n-1, dp) + solve(n-2, dp);

    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci of "+n+" is: "+ fib(n));
    }
}