package Greedy;
import java.util.*;

public class FractionalKnapsack {
    public static double fractionalKnapsack(int[] val, int[] wt, int W) {

        int n = val.length;

        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }

        Arrays.sort(idx, (a, b) -> Double.compare(
                (double) val[b] / wt[b],
                (double) val[a] / wt[a]
        ));

        double profit = 0.0;

        for (int i : idx) {
            if (wt[i] <= W) {
                profit += val[i];
                W -= wt[i];
            } else {
                profit += ((double) val[i] / wt[i]) * W;
                break;
            }
        }
        return profit;
    }
    public static void main(String[] args) {

        int[] val = {60, 100, 120};
        int[] wt = {10,20,30};
        int cap = 50;
        double ans = fractionalKnapsack(val,wt,cap);
        System.out.println("Maximum value: "+ans);
    }
}