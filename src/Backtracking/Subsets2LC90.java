package Backtracking;
import java.util.*;
public class Subsets2LC90 {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> subset, int[] nums, int start) {

        result.add(new ArrayList<>(subset));

        for(int i = start; i < nums.length; i++){

            // 🔥 skip duplicates
            if(i > start && nums[i] == nums[i-1]) continue;
            subset.add(nums[i]);
            backtrack(result, subset, nums, i+1);
            subset.remove(subset.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subsetsWithDup(arr);
        System.out.println(ans);
    }
}
