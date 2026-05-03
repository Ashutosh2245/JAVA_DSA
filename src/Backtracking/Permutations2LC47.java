package Backtracking;
import java.util.*;
public class Permutations2LC47 {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // 🔥 important
        boolean[] used = new boolean[nums.length];
        backtrack(ans, new ArrayList<>(), nums, used);
        return ans;
    }
    public static void backtrack(List<List<Integer>> ans, List<Integer> perm, int[] nums, boolean[] used) {
        if (perm.size() == nums.length) {
            ans.add(new ArrayList<>(perm));
            return;
        }
        for (int i = 0; i < nums.length; i++) {

            // skip already used elements
            if (used[i]) continue;

            // 🔥 skip duplicates
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;

            used[i] = true;
            perm.add(nums[i]);

            backtrack(ans, perm, nums, used);
            perm.remove(perm.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(permuteUnique(arr));
    }
}