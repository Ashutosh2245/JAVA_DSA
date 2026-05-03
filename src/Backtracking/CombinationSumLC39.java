package Backtracking;
import java.util.*;
public class CombinationSumLC39 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> comb, int[] candidates, int target, int start) {

        if (target == 0) {
            result.add(new ArrayList<>(comb));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) break;

            comb.add(candidates[i]);
            backtrack(result, comb, candidates, target - candidates[i], i);
            comb.remove(comb.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = combinationSum(arr, target);
        System.out.println(ans);
    }
}