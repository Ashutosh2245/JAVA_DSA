package Backtracking;
import java.util.*;
public class CombinationSum2LC40 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
            if (i > start && candidates[i] == candidates[i-1])
                continue;

            if (candidates[i] > target) break;

            comb.add(candidates[i]);
            backtrack(result, comb, candidates, target - candidates[i], i + 1);
            comb.remove(comb.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,5,6,7,10};
        int target = 8;
        List<List<Integer>> ans = combinationSum2(arr, target);
        System.out.println(ans);
    }
}
