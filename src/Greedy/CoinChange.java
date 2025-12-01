package Greedy;
import java.util.*;
public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {100, 50, 20, 10, 5, 2, 1};
        int amount = 148;
        List<Integer> result = new ArrayList<>();
        int count = 0;

        for (int c : coins) {
            while (amount >= c) {
                amount -= c;
                result.add(c);
                count++;
            }
        }

        System.out.println("Coins used: " + result);
        System.out.println("Total number of coins: " + count);
    }
}
