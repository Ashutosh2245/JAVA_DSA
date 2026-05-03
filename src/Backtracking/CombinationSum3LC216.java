package Backtracking;
import java.util.*;
public class CombinationSum3LC216 {
    public static List<List<Integer>> combinationSum3(int k, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, target, 1);
        return result;
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> comb, int k, int target, int start) {
        if (comb.size() == k && target == 0) {
            result.add(new ArrayList<>(comb));
            return;
        }
        if (comb.size() > k || target < 0) return;

        for (int i = start; i <= 9; i++) {

            comb.add(i);
            backtrack(result, comb, k, target - i, i + 1);

            comb.remove(comb.size() - 1);
        }
    }

    public static void main(String[] args) {
        int k = 3;
        int target = 7;
        List<List<Integer>> ans = combinationSum3(k, target);
        System.out.println(ans);

    }
}
