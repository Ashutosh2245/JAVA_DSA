package Backtracking;
import java.util.*;
public class Subsets1LC78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> subset, int[] nums, int start) {
        result.add(new ArrayList<>(subset));
        for(int i = start; i < nums.length; i++){
            subset.add(nums[i]);
            backtrack(result, subset, nums, i+1);
            subset.remove(subset.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subsets(arr);
        System.out.println(ans);
    }
}